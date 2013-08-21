RabbitMQResearch
================

A simple research project on RabbitMQ.

The publish will use a connection pool to avoid establishing connection to RabbitMQ broker for each message publish, as the cost of connection establishing is expensive. The pool implementation is based on apache common object pool libary.

