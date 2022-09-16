public class Ex1_tallyCounter {
        private int value;
        public Ex1_tallyCounter()
        {
            value=0;
        }
        public void click()
        { value=value+1;
        }

        public void reset()
        {
            value=0;
        }
        public int getValue() {
                return value;
        }
        public void undo()
        {
                value =value-1;
                if(value<0)
                        value=0;
        }


}
