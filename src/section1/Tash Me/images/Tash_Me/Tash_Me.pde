PImage mustache;
PImage friend;
void setup() { 
  friend= loadImage("otherfriend.jpg");
  size(900,800);
friend.resize(width,height);
mustache=loadImage("mustache.png");
mustache.resize(700,200);
} 


void draw() { 
  background(friend);
  image(mustache, 150, 300);

}
