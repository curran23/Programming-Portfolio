package ballworld;

public class CannonBall extends Ball
{
  public CannonBall( int startX, int startY, int radius,
                     double deltaX, double deltaY )
  {
    super( startX, startY, radius, deltaX, deltaY );
  }
  
  public void move()
  {
    adjustSpeedBy( 0.0, 0.3 );     // record the effect of gravity
    super.move();                  // and update my position
  }
}
