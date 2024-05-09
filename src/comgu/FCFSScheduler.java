package comgu;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

import static java.lang.Thread.sleep;

public class FCFSScheduler {
    ExecutorService runningThread = Executors.newSingleThreadExecutor();
    private List<SwProcess> readyQue = new CopyOnWriteArrayList<>();

    public static void main(String[] args) {
        FCFSScheduler scheduler = new FCFSScheduler();

        scheduler.insert(new SwProcess(1, 7));
        scheduler.start();
        //큐에 프로세스 입력 a
        //시간을 1초 단위로 흐르드록 지시
        scheduler.flowTime();
        scheduler.insert(new SwProcess(2, 3));
        scheduler.flowTime();
        //큐에 프로세스 입력 b
        //시간을 1초 단위로 흐르드록 지시
        scheduler.insert(new SwProcess(3, 1));
        scheduler.flowTime();
        //큐에 프로세스 입력 c
        //시간을 1초 단위로 흐르드록 지시

    }

    void insert(SwProcess process) {
        readyQue.add(process);
    }

    private void sleep(int i) {
        try {
            TimeUnit.MILLISECONDS.sleep(i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    void log(SwProcess process) {
        System.out.println(process + "is running" + readyQue);
    }

    void start() {
        runningThread.execute(() -> {
            while (readyQue.size() != 0) {
                for (SwProcess process : readyQue) {
                    while (process.execTime > 0) {
                        log(process);
                        sleep(1000);
                        process.execTime--;

                        if (process.execTime == 0) {
                            readyQue.removeIf(j -> j.execTime == 0);

                        }
                    }
                }
            }
            runningThread.shutdown();
            System.exit(0);
        });
    }

    private void flowTime() {
        sleep(990);
    }
}
