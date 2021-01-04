public class Range {

    private int start;
    private int end;

    private void setStart(int start) {
        this.start = start;
    }

    private void setEnd(int end) {
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public Range(int start, int end) {
        this.start = start;
        this.end = end;
        if (end <= start) {
            this.start = end;
            this.end = start;
        }
/*
    public Range(int start, int end) {
        this.start = start;
        this.end = end;

        if (start > end) {
            throw new IndexOutOfBoundsException();
        }
    }
*/
  /*  public Range(int range) {
        start = 0;
        end = range;
    }
*/
    public int length(int end, int start){
        end = getEnd();
        start = getStart();

        return end - start;
    }
}
