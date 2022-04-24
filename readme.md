#Docker

##Build image:
docker build -f Dockerfile -t spring-app:<version> .

##Local run:
docker run -d --network=host app:v2

#Minikube
##Start minikube:
minikube start

##Dashboard:
minikube dashboard

##Add image to minikube:
https://minikube.sigs.k8s.io/docs/handbook/pushing/#2-push-images-using-cache-command
minikube cache add spring-app:v1 (albo inna wersja) *long running operation*

##Redirect network to minikube (allow hit localhost)
minikube tunnel
(poprosi o haslo admina)

Then check IP of service with:
minikube kubectl -- get svc
