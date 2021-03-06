package hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries;

import hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.LeftSceneMatch;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.util.LeftSceneQuerySpecification;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import org.apache.log4j.Logger;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.incquery.runtime.api.IMatchProcessor;
import org.eclipse.incquery.runtime.api.IQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseMatcher;
import org.eclipse.incquery.runtime.exception.IncQueryException;
import org.eclipse.incquery.runtime.matchers.tuple.Tuple;
import org.eclipse.incquery.runtime.util.IncQueryLoggingUtil;

/**
 * Generated pattern matcher API of the hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.leftScene pattern,
 * providing pattern-specific query methods.
 * 
 * <p>Use the pattern matcher on a given model via {@link #on(IncQueryEngine)},
 * e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}.
 * 
 * <p>Matches of the pattern will be represented as {@link LeftSceneMatch}.
 * 
 * <p>Original source:
 * <code><pre>
 * pattern leftScene(drone : DroneInstance){
 * 	DroneInstance.position.x(drone, x);
 * 	DroneInstance.position.y(drone, y);
 * 	DroneInstance.position.z(drone, z);
 * 
 * 	DronesSimulation.droneInstances(ds, drone);
 * 	
 * 	DronesSimulation.scenario.allowedBounds.position.x(ds, scenex);
 * 	DronesSimulation.scenario.allowedBounds.position.y(ds, sceney);
 * 	DronesSimulation.scenario.allowedBounds.position.z(ds, scenez);
 * 				
 * 	DronesSimulation.scenario.allowedBounds.dimension.width(ds, boundx);
 * 	DronesSimulation.scenario.allowedBounds.dimension.height(ds, boundy);
 * 	DronesSimulation.scenario.allowedBounds.dimension.depth(ds, boundz);
 * 	
 * 	check(CollisionHelper.didDroneLeftScene(x,y,z, 
 * 		scenex, sceney, scenez, 
 * 		boundx, boundy, boundz
 * 	));	
 * }
 * </pre></code>
 * 
 * @see LeftSceneMatch
 * @see LeftSceneProcessor
 * @see LeftSceneQuerySpecification
 * 
 */
@SuppressWarnings("all")
public class LeftSceneMatcher extends BaseMatcher<LeftSceneMatch> {
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * 
   */
  public static LeftSceneMatcher on(final IncQueryEngine engine) throws IncQueryException {
    // check if matcher already exists
    LeftSceneMatcher matcher = engine.getExistingMatcher(querySpecification());
    if (matcher == null) {
    	matcher = new LeftSceneMatcher(engine);
    	// do not have to "put" it into engine.matchers, reportMatcherInitialized() will take care of it
    }
    return matcher;
  }
  
  private final static int POSITION_DRONE = 0;
  
  private final static Logger LOGGER = IncQueryLoggingUtil.getLogger(LeftSceneMatcher.class);
  
  /**
   * Initializes the pattern matcher over a given EMF model root (recommended: Resource or ResourceSet).
   * If a pattern matcher is already constructed with the same root, only a light-weight reference is returned.
   * The scope of pattern matching will be the given EMF model root and below (see FAQ for more precise definition).
   * The match set will be incrementally refreshed upon updates from this scope.
   * <p>The matcher will be created within the managed {@link IncQueryEngine} belonging to the EMF model root, so
   * multiple matchers will reuse the same engine and benefit from increased performance and reduced memory footprint.
   * @param emfRoot the root of the EMF containment hierarchy where the pattern matcher will operate. Recommended: Resource or ResourceSet.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead, e.g. in conjunction with {@link IncQueryEngine#on(Notifier)}
   * 
   */
  @Deprecated
  public LeftSceneMatcher(final Notifier emfRoot) throws IncQueryException {
    this(IncQueryEngine.on(emfRoot));
  }
  
  /**
   * Initializes the pattern matcher within an existing EMF-IncQuery engine.
   * If the pattern matcher is already constructed in the engine, only a light-weight reference is returned.
   * The match set will be incrementally refreshed upon updates.
   * @param engine the existing EMF-IncQuery engine in which this matcher will be created.
   * @throws IncQueryException if an error occurs during pattern matcher creation
   * @deprecated use {@link #on(IncQueryEngine)} instead
   * 
   */
  @Deprecated
  public LeftSceneMatcher(final IncQueryEngine engine) throws IncQueryException {
    super(engine, querySpecification());
  }
  
  /**
   * Returns the set of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pDrone the fixed value of pattern parameter drone, or null if not bound.
   * @return matches represented as a LeftSceneMatch object.
   * 
   */
  public Collection<LeftSceneMatch> getAllMatches(final DroneInstance pDrone) {
    return rawGetAllMatches(new Object[]{pDrone});
  }
  
  /**
   * Returns an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pDrone the fixed value of pattern parameter drone, or null if not bound.
   * @return a match represented as a LeftSceneMatch object, or null if no match is found.
   * 
   */
  public LeftSceneMatch getOneArbitraryMatch(final DroneInstance pDrone) {
    return rawGetOneArbitraryMatch(new Object[]{pDrone});
  }
  
  /**
   * Indicates whether the given combination of specified pattern parameters constitute a valid pattern match,
   * under any possible substitution of the unspecified parameters (if any).
   * @param pDrone the fixed value of pattern parameter drone, or null if not bound.
   * @return true if the input is a valid (partial) match of the pattern.
   * 
   */
  public boolean hasMatch(final DroneInstance pDrone) {
    return rawHasMatch(new Object[]{pDrone});
  }
  
  /**
   * Returns the number of all matches of the pattern that conform to the given fixed values of some parameters.
   * @param pDrone the fixed value of pattern parameter drone, or null if not bound.
   * @return the number of pattern matches found.
   * 
   */
  public int countMatches(final DroneInstance pDrone) {
    return rawCountMatches(new Object[]{pDrone});
  }
  
  /**
   * Executes the given processor on each match of the pattern that conforms to the given fixed values of some parameters.
   * @param pDrone the fixed value of pattern parameter drone, or null if not bound.
   * @param processor the action that will process each pattern match.
   * 
   */
  public void forEachMatch(final DroneInstance pDrone, final IMatchProcessor<? super LeftSceneMatch> processor) {
    rawForEachMatch(new Object[]{pDrone}, processor);
  }
  
  /**
   * Executes the given processor on an arbitrarily chosen match of the pattern that conforms to the given fixed values of some parameters.
   * Neither determinism nor randomness of selection is guaranteed.
   * @param pDrone the fixed value of pattern parameter drone, or null if not bound.
   * @param processor the action that will process the selected match.
   * @return true if the pattern has at least one match with the given parameter values, false if the processor was not invoked
   * 
   */
  public boolean forOneArbitraryMatch(final DroneInstance pDrone, final IMatchProcessor<? super LeftSceneMatch> processor) {
    return rawForOneArbitraryMatch(new Object[]{pDrone}, processor);
  }
  
  /**
   * Returns a new (partial) match.
   * This can be used e.g. to call the matcher with a partial match.
   * <p>The returned match will be immutable. Use {@link #newEmptyMatch()} to obtain a mutable match object.
   * @param pDrone the fixed value of pattern parameter drone, or null if not bound.
   * @return the (partial) match object.
   * 
   */
  public LeftSceneMatch newMatch(final DroneInstance pDrone) {
    return LeftSceneMatch.newMatch(pDrone);
  }
  
  /**
   * Retrieve the set of values that occur in matches for drone.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  protected Set<DroneInstance> rawAccumulateAllValuesOfdrone(final Object[] parameters) {
    Set<DroneInstance> results = new HashSet<DroneInstance>();
    rawAccumulateAllValues(POSITION_DRONE, parameters, results);
    return results;
  }
  
  /**
   * Retrieve the set of values that occur in matches for drone.
   * @return the Set of all values, null if no parameter with the given name exists, empty set if there are no matches
   * 
   */
  public Set<DroneInstance> getAllValuesOfdrone() {
    return rawAccumulateAllValuesOfdrone(emptyArray());
  }
  
  @Override
  protected LeftSceneMatch tupleToMatch(final Tuple t) {
    try {
    	return LeftSceneMatch.newMatch((hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance) t.get(POSITION_DRONE));
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in tuple not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected LeftSceneMatch arrayToMatch(final Object[] match) {
    try {
    	return LeftSceneMatch.newMatch((hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance) match[POSITION_DRONE]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  @Override
  protected LeftSceneMatch arrayToMatchMutable(final Object[] match) {
    try {
    	return LeftSceneMatch.newMutableMatch((hu.bme.mit.inf.kortargyalo.drones.simulation.dronesSimulation.DroneInstance) match[POSITION_DRONE]);
    } catch(ClassCastException e) {
    	LOGGER.error("Element(s) in array not properly typed!",e);
    	return null;
    }
  }
  
  /**
   * @return the singleton instance of the query specification of this pattern
   * @throws IncQueryException if the pattern definition could not be loaded
   * 
   */
  public static IQuerySpecification<LeftSceneMatcher> querySpecification() throws IncQueryException {
    return LeftSceneQuerySpecification.instance();
  }
}
