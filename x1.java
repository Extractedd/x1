//// Background & Size

size(600,600);
background(255);

//// Sky

fill(0,200,200);
rectMode(CENTER);
rect(0,0, 1200,500);

//// House

fill(117,0,0);
rectMode(CENTER);
rect(300,200,  100,100);

//// Roof

fill(117,0,0);
triangle(300,90,  380,150,  220,150);

//// Door

fill(150);
rectMode(CENTER);
rect(300,225, 35,50);

fill(10);
ellipseMode(CENTER);
ellipse(312,228, 6,6);

//// Window

fill(220);
rectMode(CENTER);
rect(330,180, 35,35);

fill(0);
line(313,180, 347,180);
line(330,163, 330,196);

//// Grass

fill(100,200,100);
rectMode(CENTER);
rect(0,500,  1200,490);


//// Sun

fill(255,255,0);
ellipseMode(CENTER);
ellipse(560,40, 70,70);


//// Tree

fill(127,70,0);
rectMode(CENTER);
rect(130,200, 50,100);

