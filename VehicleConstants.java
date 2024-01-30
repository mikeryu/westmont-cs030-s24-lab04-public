/**
 * Westmont College Spring 2024
 * CS 030 Lab 04, Tasks 2 & 3
 *
 * @author Assistant Professor Mike Ryu mryu@westmont.edu
 */

/**
 * Class defined as a container for constants to be used in this lab.
 */
public final class VehicleConstants {

  /* For internal use to avoid unreadable number of zeros */
  private static final long MIL = 1000000;

  /* Use in ??? Class(es) */
  public static final long MINIMUM_VALUE_PER_CARGO_TON = 10000;

  /* Use in ??? Class(es) */
  public static final long MIN_COMPENSATION_PER_PASSENGER = 10000;

  /* Use in OilTanker Class */
  public static final long OIL_TANKER_VALUE_PER_DISPLACEMENT = 500;

  /* Use in MiniVan Class */
  public static final long MINIVAN_VALUE_PER_CUPHOLDER = 1000;

  /* Use in Airliner Class */
  public static final long AIRCRAFT_DEFAULT_VALUE = 250 * MIL;
  public static final long BOEING_LIABILITY_MULTIPLIER = 10;
}
