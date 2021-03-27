package HomeWork2
 /*
 TODO: (Optional- Select one at least)
  Consider a graphics system that has classes for various figures—say, rectangles,
  boxes, triangles, circles, and so on. For example, a rectangle might have data
  members’ height, width, and center point, while a box and circle might have only
  a center point and an edge length or radius, respectively.
  In a well-designed system,these would be derived from a common class "Figure".
  You are to implement such a system.
  The class Figure is the base class. You should add only Rectangle and Triangle classes derived from Figure.
   Each class has stubs for functions erase and draw.
   Each of these functions outputs a message telling the name of the class and what
   functions has been called. Because these are just stubs, they do nothing more than
   output this message.
   The function center calls the erase and draw functions to erase and redraw
   the figure at the center. Because you have only stubs for erase and draw,
   center will not do any “centering” but will call the functions erase and draw, which will allow you
   to see which versions of draw and center it calls.
   Also, add an output message in the function center that announces that center is being called.
   The functions should take no arguments. Also, define a demonstration program for your classes.
  */