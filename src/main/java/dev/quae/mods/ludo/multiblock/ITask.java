package dev.quae.mods.ludo.multiblock;

public interface ITask {
    void tick();

    boolean isDone();

    interface Executor<T extends ITask> {
        default boolean tickTask(T task) {
            task.tick();
            return task.isDone();
        }
    }
}
