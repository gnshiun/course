#物件導向

class Animal:
    name = ''

    def __init__(self, name):
        self.name = name

    def walk(self):
        print('walking')

    def eat(self):
        print('eating')


class Dog(Animal):
    def __init__(self, name):
        super().__init__(name)

    def walk(self):
        print('{0} using foot walk'.format(self.name))

    def eat(self):
        print('{0} eat bone'.format(self.name))

#程序導向
def show_data():
    pass

	
animal = Dog('A')
animal.eat()
animal.walk()
