package OOP2;

public class Line {
    private Point begin;
    private Point end;

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Line(int beginX, int beginY, int endX, int endY) {
        begin = new Point(beginX, beginY);
        end = new Point(endX, endY);
    }

    public Point getBegin() {
        return begin;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }

    @Override
    public String toString() {
        return "Line{" +
                "begin=" + begin +
                ", end=" + end +
                '}';
    }
}
