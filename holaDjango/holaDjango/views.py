from django.http import HttpResponse

#Primera vista
def saludo(request):
    return HttpResponse('Bienvenidos a OpenBootcamp')

#Segunda vista
def despedida(request):
    return HttpResponse('Gracias por estudiar Django en Open Bootcamp')

#Primera vista con patámetro
def adulto(request, edad):
    if edad >=18:
        return HttpResponse('Eres mayor de edad')
    else:
        return HttpResponse('No eres mayor de edad')
