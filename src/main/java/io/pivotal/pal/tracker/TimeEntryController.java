package io.pivotal.pal.tracker;

import org.springframework.http.ResponseEntity;
<<<<<<< HEAD

import java.util.List;

public class TimeEntryController {
    private final TimeEntryRepository timeEntryRepository;
    public TimeEntryController(TimeEntryRepository timeEntryRepository) {
       this.timeEntryRepository=timeEntryRepository;
    }

    public ResponseEntity<TimeEntry> create(TimeEntry timeEntryToCreate) {
      TimeEntry timeentry=timeEntryRepository.create(timeEntryToCreate);
      return ResponseEntity.created(null).body(timeentry);
    }//Works Mohammed Z

    public ResponseEntity<TimeEntry> read(long timeEntryId) {
        TimeEntry timeentry=timeEntryRepository.find(timeEntryId);
        if (timeentry==null){
            return ResponseEntity.notFound().build();
        }
        //return ResponseEntity.created(null).body(timeentry);
        return ResponseEntity.ok().body(timeentry);
    }//Test Case Works

    public ResponseEntity<List<TimeEntry>> list() {

        List<TimeEntry> timeEntryList= timeEntryRepository.list();
        //return ResponseEntity.created(null).body(timeentry);
        return ResponseEntity.ok().body(timeEntryList);

        //return null;
    }//Test Case Works- MZ 3/2/21

    public ResponseEntity<TimeEntry> update(long timeEntryId, TimeEntry timeEntryToUpdate) {
        TimeEntry timeEntry=timeEntryRepository.update(timeEntryId,timeEntryToUpdate);
        if (timeEntry==null){
            return ResponseEntity.notFound().build();
        }
        return ResponseEntity.ok().body(timeEntry);

    }//Works MZ 3/2/21

    public ResponseEntity<Void> delete(long timeEntryId) {
        TimeEntry timeentry=timeEntryRepository.delete(timeEntryId);
        //return ResponseEntity.created(null).body(timeentry);
        return ResponseEntity.noContent().build();

    }
}
    
=======
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.ResponseEntity.*;

@RestController
@RequestMapping("/time-entries")
public class TimeEntryController {
    private final TimeEntryRepository timeEntriesRepo;

    public TimeEntryController(TimeEntryRepository timeEntriesRepo) {
        this.timeEntriesRepo = timeEntriesRepo;
    }

    @PostMapping
    public ResponseEntity<TimeEntry> create(@RequestBody TimeEntry timeEntryToCreate) {
        return created(null)
                .body(timeEntriesRepo.create(timeEntryToCreate));
    }

    @GetMapping("{id}")
    public ResponseEntity<TimeEntry> read(@PathVariable long id) {
        var timeEntryFound = timeEntriesRepo.find(id);

        return timeEntryFound == null ?
                notFound().build() :
                ok(timeEntryFound);
    }

    @GetMapping
    public ResponseEntity<List<TimeEntry>> list() {
        return ok(timeEntriesRepo.list());
    }

    @PutMapping("{id}")
    public ResponseEntity<TimeEntry> update(@PathVariable long id, @RequestBody TimeEntry timeEntry) {
        var timeEntryUpdated = timeEntriesRepo.update(id, timeEntry);

        return timeEntryUpdated == null ?
                notFound().build() :
                ok(timeEntryUpdated);
    }

    @DeleteMapping("{id}")
    public ResponseEntity<Void> delete(@PathVariable long id) {
        timeEntriesRepo.delete(id);

        return noContent().build();
    }
}
>>>>>>> lab4-sol
