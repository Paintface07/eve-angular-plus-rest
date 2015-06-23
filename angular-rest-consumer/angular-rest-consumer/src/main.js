use strict;

angular.module('eveConsumer', [
	'ngRoute'
]).config(['$routeProvider', function($routeProvider) {
	$routeProvider.otherwise({redirectTo: '/'});
}]);
