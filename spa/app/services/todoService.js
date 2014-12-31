(function() {
  "use strict";

  angular.module("todos").service('ToDoService', function(Restangular) {
    var todos = Restangular.all('todos');

    return todos;
  });

}());
