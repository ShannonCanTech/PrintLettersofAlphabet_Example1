class Scratch {
    public static void main(String[] args) {
        char a = 'A';
        for(int i = 0; i <= a; a++){
            System.out.println(a);
            a += 1;
            String Z = String.valueOf(a);
            if(Z.equals("Z")){
                System.out.println(a);
                break;
            }
        }
    }
}
