public class Point {
        int x;
        int y;

        Point(){
            this(0,0);
        }


        Point (int x, int y) {
            this.x = x;
            this.y = y;
        }


        void printPoint(){
            System.out.println("точка х: " + x + ", точка y: " + y);
        }

        Point pointCenter (Point other){
            Point content;
            content = new Point((this.x > other.x ? (this.x - other.x) : (other.x - this.x)),
                    (this.y > other.y ? (this.y - other.y) : (other.y - this.y)));
            return content;
        }

        Point scale (){
            Point scale;
            scale = new Point(
                    this.x/2, this.y/2
            );
            return scale;
        }


    }

