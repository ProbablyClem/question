/**
 *
 */
package fr.gamedev.question.greeting;

/**
 * @author djer1
 *
 */
public class Greeting {
/**id.*/
private final long id;
/**content.*/
private final String content;

public Greeting(final long newId, final String newContent) {
this.id = newId;
this.content = newContent;
}

/**@return id*/
public long getId() {
return id;
}
/**@return content*/
public String getContent() {
return content;
}
}
