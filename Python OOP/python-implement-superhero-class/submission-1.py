class SuperHero:
    """
    A class to represent a superhero.

    Attributes:
        name (str): The superhero's name
        power (str): The superhero's main superpower
        health (int): The superhero's health points
    """

    def __init__(self, name: str, power: str, health: int):
        self.name = name
        self.power = power
        self.health = health


# TODO: Create Superhero instances
heroOne = SuperHero("Batman", "Intelligence", 100)
heroTwo = SuperHero("Superman", "Strength", 150)

# TODO: Print out the attributes of each superhero
print(heroOne.name)
print(heroOne.power)
print(heroOne.health)
print(heroTwo.name)
print(heroTwo.power)
print(heroTwo.health)