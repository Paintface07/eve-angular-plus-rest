'use strict';

angular.module('eveConsumer', ['ui.router', 'config', 'RootController'])
.config(['$stateProvider', '$urlRouterProvider', '$httpProvider', function($stateProvider, $urlRouterProvider, $httpProvider) {

	$urlRouterProvider.otherwise('/home');
	
	$stateProvider.state('home', {
		url: '/home',
		templateUrl: 'src/partials/home.html',
		controller: 'RootController'
	});
	
	console.log('>>> ' + $httpProvider.defaults.headers.common);
	delete $httpProvider.defaults.headers.common['X-Requested-With'];
	$httpProvider.defaults.headers.common['Content-Type'] = "application/json";
}]);
