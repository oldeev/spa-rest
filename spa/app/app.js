(function () {
  "use strict";

  angular.module("todos", ['restangular']);

  angular.module("todos").run(function (Restangular) {
    Restangular.setBaseUrl('http://localhost:9090/productivity/api');
  });

}());
