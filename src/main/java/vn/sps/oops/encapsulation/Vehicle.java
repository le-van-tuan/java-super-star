package vn.sps.oops.encapsulation;

import vn.sps.oops.shared.GenericJson;

/**
 * <p>
 * Examples of lowercase  mappings are in the following table:
 * <table class="plain">
 * <caption style="display:none">Lowercase mapping examples showing language code of locale, upper case, lower case, and description</caption>
 * <thead>
 * <tr>
 *   <th scope="col">Language Code of Locale</th>
 *   <th scope="col">Upper Case</th>
 *   <th scope="col">Lower Case</th>
 *   <th scope="col">Description</th>
 * </tr>
 * </thead>
 * <tbody>
 * <tr>
 *   <td>tr (Turkish)</td>
 *   <th scope="row" style="font-weight:normal; text-align:left">&#92;u0130</th>
 *   <td>&#92;u0069</td>
 *   <td>capital letter I with dot above -&gt; small letter i</td>
 * </tr>
 * <tr>
 *   <td>tr (Turkish)</td>
 *   <th scope="row" style="font-weight:normal; text-align:left">&#92;u0049</th>
 *   <td>&#92;u0131</td>
 *   <td>capital letter I -&gt; small letter dotless i </td>
 * </tr>
 * <tr>
 *   <td>(all)</td>
 *   <th scope="row" style="font-weight:normal; text-align:left">French Fries</th>
 *   <td>french fries</td>
 *   <td>lowercased all chars in String</td>
 * </tr>
 * <tr>
 *   <td>(all)</td>
 *   <th scope="row" style="font-weight:normal; text-align:left">
 *       &Iota;&Chi;&Theta;&Upsilon;&Sigma;</th>
 *   <td>&iota;&chi;&theta;&upsilon;&sigma;</td>
 *   <td>lowercased all chars in String</td>
 * </tr>
 * </tbody>
 * </table>
 */

public abstract class Vehicle extends GenericJson {

    protected void printVehicleName() {
        System.out.println("This is vehicle");
    }

    private double getVehiclePrice() {
        return 10;
    }

    void shortVehicleName() {
        System.out.println("Short name");
    }
}
