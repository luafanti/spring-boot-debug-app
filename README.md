# Spring Boot debug app

Spring Boot application for debugging purpose.
The application has web server to expose endpoints that can print information to help investigate your Kubernetes/Helm setup.


## Endpoints
* `/envs` - return list of all OS envs injected to docker image or Pod
* `/logs/info` `/logs/debug` `/logs/exception` - produce logs according to log level. It can help deal with log exporters like FluentBit or Promtail.
* `/delays/1` `/deylays/3` `/delays/5`, `delays/custom?seconds=10` - return synchronous response with delay. Can help with debug metrics.