from django.shortcuts import render

def simple(request):
    return render(request, 'simple.html', {})

def dinamico(request, name):
    categorias= ['código', 'diseño', 'marketing']
    contexto= {'name':name, 'categorias':categorias} #El contexto siempre es un diccionario con clave-valor
    return render(request, 'dinamico.html', contexto)
