//////// What am I trying to do???
//////// What is my name?  (CST 112; today's date?)

//// GLOBALS:  coordinates, speed, etc.
float x, y;       // Position of creature.
float dx, dy;     // Speed.
float horizon;

//// SETUP:  window size, initialization (start in middle of screen).
void setup() {
 size(600,600);
  horizon=  height/4;
  x=  width/2;
  y=  height/2;
  dx=  3;
  dy=  2;
}

//// NEXT FRAME:  scene, action, show.
void draw() {
//// Background & Size


background(255);

//// Sky

fill(0,200,200);
rectMode(CENTER);
rect(0,0, 1200,500);

//// Cloud
float cloudX=50, cloudY=50, cloudW=100, cloudH=40;
  cloudX=  x + dx;
  y=  y + dy;
  
fill(255);
ellipse(cloudX, cloudY, cloudW, cloudH);


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
rect(0,495,  1200,490);


//// Sun

fill(255,255,0);
ellipseMode(CENTER);
ellipse(560,40, 70,70);


//// Tree

fill(127,70,0);
rectMode(CENTER);
rect(130,200, 50,100);

fill(100,200,100);
ellipse(100,150, 60,60);
ellipse(160,150, 60,60);
ellipse(130,110, 60,60);


//// Tree #2

fill(127,70,0);
rectMode(CENTER);
rect(130,200, 50,100);

fill(100,200,100);
ellipse(100,150, 60,60);
ellipse(160,150, 60,60);
ellipse(130,110, 60,60);


//// ACTION:  move (x,y) coordinates.
  x=  x + dx;
  y=  y + dy;
  
}


//////// HANDLERS:  mouse clicks, keys
void mousePressed() {
  x=  mouseX;                             // Set (x,y) to mouse
  y=  mouseY;
  //
  dx=  random( -6, +6 );                  // random speed.
  dy=  random( -4, +4 );
}

void keyPressed() {
  if (key == 'q') {
    exit();                           // press 'q' key to QUIT.
  }
}



   


