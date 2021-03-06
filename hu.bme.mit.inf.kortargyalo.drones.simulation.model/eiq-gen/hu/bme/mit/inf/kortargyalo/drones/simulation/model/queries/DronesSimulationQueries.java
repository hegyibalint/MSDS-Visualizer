package hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries;

import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.AllDronesAreInactiveMatcher;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.AllRoleFilledMatcher;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.CollisionWithObjectMatcher;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.CrashMatcher;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.DroneBatteryDepletedMatcher;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.DroneInChargerMatcher;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.FirstRoleFilledMatcher;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.LeftSceneMatcher;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.ReplacedObservationMatcher;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.util.AllDronesAreInactiveQuerySpecification;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.util.AllRoleFilledQuerySpecification;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.util.CollisionWithObjectQuerySpecification;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.util.CrashQuerySpecification;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.util.DroneBatteryDepletedQuerySpecification;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.util.DroneInChargerQuerySpecification;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.util.FirstRoleFilledQuerySpecification;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.util.LeftSceneQuerySpecification;
import hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries.util.ReplacedObservationQuerySpecification;
import org.eclipse.incquery.runtime.api.IncQueryEngine;
import org.eclipse.incquery.runtime.api.impl.BaseGeneratedPatternGroup;
import org.eclipse.incquery.runtime.exception.IncQueryException;

/**
 * A pattern group formed of all patterns defined in dronesSimulationQueries.eiq.
 * 
 * <p>Use the static instance as any {@link org.eclipse.incquery.runtime.api.IPatternGroup}, to conveniently prepare
 * an EMF-IncQuery engine for matching all patterns originally defined in file dronesSimulationQueries.eiq,
 * in order to achieve better performance than one-by-one on-demand matcher initialization.
 * 
 * <p> From package hu.bme.mit.inf.kortargyalo.drones.simulation.model.queries, the group contains the definition of the following patterns: <ul>
 * <li>droneIsInactive</li>
 * <li>droneIsActive</li>
 * <li>allDronesAreInactive</li>
 * <li>roleFilled</li>
 * <li>notAllRoleFilled</li>
 * <li>allRoleFilled</li>
 * <li>firstRoleFilled</li>
 * <li>crash</li>
 * <li>leftScene</li>
 * <li>collisionWithObject</li>
 * <li>droneInCharger</li>
 * <li>observesSameObject</li>
 * <li>replacedObservation</li>
 * <li>droneBatteryDepleted</li>
 * </ul>
 * 
 * @see IPatternGroup
 * 
 */
@SuppressWarnings("all")
public final class DronesSimulationQueries extends BaseGeneratedPatternGroup {
  /**
   * Access the pattern group.
   * 
   * @return the singleton instance of the group
   * @throws IncQueryException if there was an error loading the generated code of pattern specifications
   * 
   */
  public static DronesSimulationQueries instance() throws IncQueryException {
    if (INSTANCE == null) {
    	INSTANCE = new DronesSimulationQueries();
    }
    return INSTANCE;
  }
  
  private static DronesSimulationQueries INSTANCE;
  
  private DronesSimulationQueries() throws IncQueryException {
    querySpecifications.add(AllDronesAreInactiveQuerySpecification.instance());
    querySpecifications.add(AllRoleFilledQuerySpecification.instance());
    querySpecifications.add(FirstRoleFilledQuerySpecification.instance());
    querySpecifications.add(CrashQuerySpecification.instance());
    querySpecifications.add(LeftSceneQuerySpecification.instance());
    querySpecifications.add(CollisionWithObjectQuerySpecification.instance());
    querySpecifications.add(DroneInChargerQuerySpecification.instance());
    querySpecifications.add(ReplacedObservationQuerySpecification.instance());
    querySpecifications.add(DroneBatteryDepletedQuerySpecification.instance());
  }
  
  public AllDronesAreInactiveQuerySpecification getAllDronesAreInactive() throws IncQueryException {
    return AllDronesAreInactiveQuerySpecification.instance();
  }
  
  public AllDronesAreInactiveMatcher getAllDronesAreInactive(final IncQueryEngine engine) throws IncQueryException {
    return AllDronesAreInactiveMatcher.on(engine);
  }
  
  public AllRoleFilledQuerySpecification getAllRoleFilled() throws IncQueryException {
    return AllRoleFilledQuerySpecification.instance();
  }
  
  public AllRoleFilledMatcher getAllRoleFilled(final IncQueryEngine engine) throws IncQueryException {
    return AllRoleFilledMatcher.on(engine);
  }
  
  public FirstRoleFilledQuerySpecification getFirstRoleFilled() throws IncQueryException {
    return FirstRoleFilledQuerySpecification.instance();
  }
  
  public FirstRoleFilledMatcher getFirstRoleFilled(final IncQueryEngine engine) throws IncQueryException {
    return FirstRoleFilledMatcher.on(engine);
  }
  
  public CrashQuerySpecification getCrash() throws IncQueryException {
    return CrashQuerySpecification.instance();
  }
  
  public CrashMatcher getCrash(final IncQueryEngine engine) throws IncQueryException {
    return CrashMatcher.on(engine);
  }
  
  public LeftSceneQuerySpecification getLeftScene() throws IncQueryException {
    return LeftSceneQuerySpecification.instance();
  }
  
  public LeftSceneMatcher getLeftScene(final IncQueryEngine engine) throws IncQueryException {
    return LeftSceneMatcher.on(engine);
  }
  
  public CollisionWithObjectQuerySpecification getCollisionWithObject() throws IncQueryException {
    return CollisionWithObjectQuerySpecification.instance();
  }
  
  public CollisionWithObjectMatcher getCollisionWithObject(final IncQueryEngine engine) throws IncQueryException {
    return CollisionWithObjectMatcher.on(engine);
  }
  
  public DroneInChargerQuerySpecification getDroneInCharger() throws IncQueryException {
    return DroneInChargerQuerySpecification.instance();
  }
  
  public DroneInChargerMatcher getDroneInCharger(final IncQueryEngine engine) throws IncQueryException {
    return DroneInChargerMatcher.on(engine);
  }
  
  public ReplacedObservationQuerySpecification getReplacedObservation() throws IncQueryException {
    return ReplacedObservationQuerySpecification.instance();
  }
  
  public ReplacedObservationMatcher getReplacedObservation(final IncQueryEngine engine) throws IncQueryException {
    return ReplacedObservationMatcher.on(engine);
  }
  
  public DroneBatteryDepletedQuerySpecification getDroneBatteryDepleted() throws IncQueryException {
    return DroneBatteryDepletedQuerySpecification.instance();
  }
  
  public DroneBatteryDepletedMatcher getDroneBatteryDepleted(final IncQueryEngine engine) throws IncQueryException {
    return DroneBatteryDepletedMatcher.on(engine);
  }
}
