package org.catmq.util;

import java.nio.ByteBuffer;

public class ByteUtil {
    /**
     * 将一系列的long型变量转换成byte数组
     *
     * @param longs
     * @return
     */
    public static byte[] convLong2Bytes(long... longs) {
        ByteBuffer byteBuffer = ByteBuffer.allocate(longs.length * Long.BYTES);
        for (long l : longs) {
            byteBuffer.putLong(l);
        }
        return byteBuffer.array();
    }

    /**
     * 缓冲区上的操作，使用ByteBuffer
     * @param bytes
     * @param index
     * @return
     */
    public static long getLong(byte[] bytes, int index) {
        // allocate(int capacity) —— 分配新的字节缓冲区，且新缓冲区的位置将为零，其限制将是其容量，其标记将未定义，其每个元素将初始化为零
        // @param capacity – 新缓冲区的容量，以字节为单位
        // @return 一个新的字节缓冲区
        // 异常：如果capacity为负数会抛出异常
        ByteBuffer buffer = ByteBuffer.allocate(Long.BYTES);
        // buffer.put(byte[] src, int offset, int length) —— 将字节从给定的源数组传输到此缓冲区
        // 从 length 数组中的给定偏移量和此缓冲区的当前位置开始。然后，此缓冲区的位置将递增 length
        // src: 要从中读取字节的数组
        // offset: 要读取的第一个字节的数组内的偏移量，必须为非负数且不大于 src.length
        // length: 要从给定数组中读取的字节数，必须为非负数且不大于 src.length - offset
        // 对窗体 dst.put(src,off,len) 的此方法的调用与循环具有完全相同的效果
        buffer.put(bytes, index, bytes.length);
        // Flips this buffer. The limit is set to the current position and then the position is set to zero.
        // If the mark is defined then it is discarded. After a sequence of channel-read or put operations,
        // invoke this method to prepare for a sequence of channel-write or relative get operations。
        /* 观察源码 有 Invariants: mark <= position <= limit <= capacity
            limit = position;
            position = 0;
            mark = -1;
        */
        buffer.flip();
        // 取出buffer当前位置对应的long值
        return buffer.getLong();
    }
}
