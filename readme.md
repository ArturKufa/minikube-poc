# Docker

## Build image:
docker build -f Dockerfile -t spring-app:version .

## Local run:
docker run -t --network=host app:v2

# Minikube
## Start minikube:
minikube start

## Dashboard:
minikube dashboard

## Add image to minikube:
https://minikube.sigs.k8s.io/docs/handbook/pushing/#2-push-images-using-cache-command
minikube cache add spring-app:version *long running operation*

## Redirect network to minikube (allow hit localhost)
minikube tunnel
(asks for admin password)

Then check IP of service with:
minikube kubectl -- get svc

## Ingress

https://kubernetes.io/docs/tasks/access-application-cluster/ingress-minikube/


