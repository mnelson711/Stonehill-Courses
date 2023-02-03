#This program will write the initials mn into the turtle window
import turtle

turtle.bgcolor("Pink")
#this creates a new turtle
skk = turtle.Turtle()
#changes the direction of the turtle to go up
skk.left(90)
#moves the turtle forward 100 pixels up
skk.forward(100)
#changes the direction to go down diagonally
skk.right(135)
#moves turtle down 100 pixel
skk.forward(100)
#changes direction to go up diagonally
skk.left(90)
#moves turtle up
skk.forward(100)
#changes direction to go straight down
skk.right(135)
#starts second letter
skk.forward(200)
skk.backward(100)
#changes direction to go diagonally down
skk.left(45)
#moves turtle down diagonally
skk.forward(150)
#changes direction to go straight up
skk.left(135)
#moves turtle straight up
skk.forward(100)
skk.ht()
skk.setx(0)
skk.sety(0)
skk.st()
