package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl implements MachineService<Machine> {
    private final BulldozerProducer bulldozerProducer;
    private final ExcavatorProducer excavatorProducer;
    private final TruckProducer truckProducer;

    public MachineServiceImpl(BulldozerProducer bulldozerProducer,
                              ExcavatorProducer excavatorProducer,
                              TruckProducer truckProducer) {
        this.bulldozerProducer = bulldozerProducer;
        this.excavatorProducer = excavatorProducer;
        this.truckProducer = truckProducer;
    }

    public MachineServiceImpl() {
        this(new BulldozerProducer(), new ExcavatorProducer(), new TruckProducer());
    }

    @Override
    public List<Machine> getAll(Class<? extends Machine> type) {
        if (type == Bulldozer.class) {
            return new ArrayList<>(bulldozerProducer.get());
        }
        if (type == Excavator.class) {
            return new ArrayList<>(excavatorProducer.get());
        }
        if (type == Truck.class) {
            return new ArrayList<>(truckProducer.get());
        }
        return Collections.emptyList();
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {
        for (int i = 0; i < machines.size(); i++) {
            machines.set(i, value);
        }
    }

    @Override
    public void startWorking(List<? extends Machine> list) {
        for (Machine machine : list) {
            machine.doWork();
        }
    }
}
