package ru.DmN.bpl;

import ru.DmN.bpl.annotations.Const;
import ru.DmN.bpl.annotations.NoExpression;
import ru.DmN.bpl.annotations.SingleLine;

@SingleLine
public final class CallBuilder {
    public static final String CLASS_NAME = CallBuilder.class.getName().replace('.', '/');

    public CallBuilder() {
        throw BytecodeUtils.THROW;
    }

    public CallBuilder alloc(@Const String name) {
        throw BytecodeUtils.THROW;
    }

    public CallBuilder arg(@NoExpression Object v) {
        throw BytecodeUtils.THROW;
    }

    public CallBuilder arg(@NoExpression double v) {
        throw BytecodeUtils.THROW;
    }

    public CallBuilder arg(@NoExpression float v) {
        throw BytecodeUtils.THROW;
    }

    public CallBuilder arg(@NoExpression long v) {
        throw BytecodeUtils.THROW;
    }

    public CallBuilder arg(@NoExpression int v) {
        throw BytecodeUtils.THROW;
    }

    public CallBuilder arg(@NoExpression short v) {
        throw BytecodeUtils.THROW;
    }

    public CallBuilder arg(@NoExpression byte v) {
        throw BytecodeUtils.THROW;
    }

    public CallBuilder arg(@NoExpression boolean v) {
        throw BytecodeUtils.THROW;
    }

    public CallBuilder invokeVirtual(@Const String name, @Const String desc, @Const String clazz) {
        throw BytecodeUtils.THROW;
    }

    public CallBuilder invokeSpecial(@Const String name, @Const String desc, @Const String clazz, @Const boolean isInterface) {
        throw BytecodeUtils.THROW;
    }

    public CallBuilder invokeStatic(@Const String name, @Const String desc, @Const String clazz, @Const boolean isInterface) {
        throw BytecodeUtils.THROW;
    }

    public CallBuilder invokeInterface(@Const String name, @Const String desc, @Const String clazz) {
        throw BytecodeUtils.THROW;
    }

    public CallBuilder invokeDynamic(@Const String name, @Const String desc, @Const String clazz, @Const String bname, @Const String bdesc) {
        throw BytecodeUtils.THROW;
    }

    public CallBuilder invokeDynamic(@Const String name, @Const String desc, @Const String clazz, @Const String bname, @Const String bdesc, @Const int argc) {
        throw BytecodeUtils.THROW;
    }

    public CallBuilder ldc(@Const String name, @Const String desc, @Const String clazz, @Const String bname, @Const String bdesc) {
        throw BytecodeUtils.THROW;
    }

    public CallBuilder ldc(@Const String name, @Const String desc, @Const String clazz, @Const String bname, @Const String bdesc, @Const int argc) {
        throw BytecodeUtils.THROW;
    }

    public Object endA() {
        throw BytecodeUtils.THROW;
    }

    public double endD() {
        throw BytecodeUtils.THROW;
    }

    public float endF() {
        throw BytecodeUtils.THROW;
    }

    public long endL() {
        throw BytecodeUtils.THROW;
    }

    public int endI() {
        throw BytecodeUtils.THROW;
    }

    public char endC() {
        throw BytecodeUtils.THROW;
    }

    public short endS() {
        throw BytecodeUtils.THROW;
    }

    public byte endB() {
        throw BytecodeUtils.THROW;
    }

    public boolean endZ() {
        throw BytecodeUtils.THROW;
    }

    public void end() {
        throw BytecodeUtils.THROW;
    }
}