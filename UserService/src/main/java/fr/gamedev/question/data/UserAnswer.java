package fr.gamedev.question.data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 * @author djer1
 */
@Entity
public class UserAnswer {

    /** id. */
    @GeneratedValue(generator = "seq_gen_userAnswer")
    @GenericGenerator(name = "seq_gen_userAnswer", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator",
            parameters = { @Parameter(name = "sequence_name", value = "seq_answerUser"),
                    @Parameter(name = "initial_value", value = "0"), @Parameter(name = "increment_size", value = "1") })
    @Id
    private long id;

    /** User answering providing answer. */
    @ManyToOne
    private User user;
    /** The correct answer (linked to the question). */

    //Many to one
    private Long answerId;
    /** Points earn by user for this answer. */
    private Integer points;

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param theId the id to set
     */
    public void setId(final long theId) {
        this.id = theId;
    }

    /**
     * @return the user
     */
    public User getUser() {
        return user;
    }

    /**
     * @param theUser the user to set
     */
    public void setUser(final User theUser) {
        this.user = theUser;
    }

    /**
     * @return the points
     */
    public Integer getPoints() {
        return points;
    }

    /**
     * @param newPoints the points to set
     */
    public void setPoints(final Integer newPoints) {
        this.points = newPoints;
    }

    public Long getAnswerId() {
        return answerId;
    }

    public void setAnswerId(Long answerId) {
        this.answerId = answerId;
    }
}
