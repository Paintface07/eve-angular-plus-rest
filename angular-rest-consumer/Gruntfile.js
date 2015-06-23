module.exports = function(grunt) {
	grunt.initConfig({
		pkg: grunt.file.readJSON('package.json'),
		connect: {
			dev: {
				port: 9080,
				base: 'WebContent'
			}
		}
	});
	
	grunt.loadNpmTasks('grunt-connect');
	grunt.registerTask('default', 'connect:dev');
};