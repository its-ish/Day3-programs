class pascals{
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> answer = new ArrayList<List<Integer>>();
        answer.add(Arrays.asList(1));
        if(numRows == 1) return answer;
        answer.add(Arrays.asList(1, 1));
        if(numRows == 2) return answer;

        numRows = numRows - 2;
        while(numRows > 0)
        {
            List<Integer> temp = new ArrayList<Integer>();
            List<Integer> temp1 = answer.get(answer.size()-1);
            temp.add(1);
            for(int i = 0; i+1 < temp1.size(); i++)
            {
                temp.add(temp1.get(i) + temp1.get(i+1));
            }
            temp.add(1);
            answer.add(temp);
            numRows--;
        }

        return answer;
    }
}