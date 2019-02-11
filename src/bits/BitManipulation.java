package bits;

public class BitManipulation {
    public static void main(String[] args) {
        // 0 is not shown
        System.out.println(Integer.toBinaryString(swapBitsIn8Bit((byte) 0b10101111)));
    }
    private static byte swapBitsIn8Bit(byte original){
        return (byte) ((original & 0b10101010) >> 1 | (original & 0b01010101) << 1);
    }

}
