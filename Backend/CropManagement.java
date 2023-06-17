package Backend;

public class CropManagement{
    /*
     Features we need:
     1) Know crop Types
     2) Planting Dates
     3) Harvesting Dates
     4) Yield Information
    */

    // Declare variables
    private String cropName;
    private String cropType;
    private String plantingDate;
    private String harvestingDate;
    private String yieldInformation;

    // Constructor
    public CropManagement(String cropName, String cropType, String plantingDate, String harvestingDate, String yieldInformation) {
        this.cropName = cropName;
        this.cropType = cropType;
        this.plantingDate = plantingDate;
        this.harvestingDate = harvestingDate;
        this.yieldInformation = yieldInformation;
    }

    // Getter and Setter methods

    public String getCropName() {
        return cropName;
    }

    public void setCropName(String cropName) {
        this.cropName = cropName;
    }

    public String getCropType() {
        return cropType;
    }

    public void setCropType(String cropType) {
        this.cropType = cropType;
    }

    public String getPlantingDate() {
        return plantingDate;
    }

    public void setPlantingDate(String plantingDate) {
        this.plantingDate = plantingDate;
    }

    public String getHarvestingDate() {
        return harvestingDate;
    }

    public void setHarvestingDate(String harvestingDate) {
        this.harvestingDate = harvestingDate;
    }

    public String getYieldInformation() {
        return yieldInformation;
    }

    public void setYieldInformation(String yieldInformation) {
        this.yieldInformation = yieldInformation;
    }

    // Main method for testing
    public static void main(String[] args) {
        // Create an instance of CropManagement
        CropManagement crop = new CropManagement("Wheat", "Cereal", "2023-03-01", "2023-06-15", "10 tons");

        // Print crop details
        System.out.println("Crop Name: " + crop.getCropName());
        System.out.println("Crop Type: " + crop.getCropType());
        System.out.println("Planting Date: " + crop.getPlantingDate());
        System.out.println("Harvesting Date: " + crop.getHarvestingDate());
        System.out.println("Yield Information: " + crop.getYieldInformation());
    }
}

