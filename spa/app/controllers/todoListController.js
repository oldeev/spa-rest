(function () {
  "use strict";

  angular.module("todos").controller('ToDoListController', function ($scope, ToDoService) {

    var vm = this;

    vm.loadJobs = function() {
      ToDoService.getList( {full: true}).then(function(todos) {
        vm.todos = todos;
      });
    };

    vm.loadJobs();

  });
}());
