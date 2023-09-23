/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import javax.swing.ImageIcon;
import model.Address;
import model.Doctor;
import model.Driver;
import model.InsuranceCoverage;
import model.Patient;
import model.Person;
import model.VehicleRegistration;

/**
 *
 * @author Kunal
 */
public class DisplayReportJPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientReportJPanel
     */
    Person person;
    Address address;
    Driver driver;
    Patient patient;
    Doctor doctor;
    VehicleRegistration vehicle;
    InsuranceCoverage insurance;
       
    public DisplayReportJPanel(Person person,Address address,Driver driver,Patient patient,Doctor doctor,VehicleRegistration vehicle,InsuranceCoverage insurance) {
        initComponents();
        this.person = person;
        this.address = address;
        this.driver = driver;
        this.patient = patient;
        this.doctor = doctor;
        this.vehicle = vehicle;
        this.insurance = insurance;
        ImageIcon icon = new ImageIcon(person.getUpload());
        lblPic.setIcon(icon);
        displayReport();
        
        System.out.println("Person Information");
        System.out.println("\nFull Name: " + person.getName());
        System.out.println("Date of Birth: " + person.getDob());
        System.out.println("Age: " + person.getAge());
        System.out.println("Gender: " + person.getGender());
        System.out.println("SSN: " + person.getSsn());
        System.out.println("Email: " + person.getEmail());
        System.out.println("Contact: " + person.getContact());
        System.out.println("Occupation: " + person.getOccupation());
        System.out.println("Nationality: " + person.getNationality());
        System.out.println("Marital Status: " + person.getMaritalstatus());
        
        System.out.println("*********************************************");
        System.out.println("\nAddress Information");
        System.out.println("\nLocation: " + address.getLocation());
        System.out.println("City: " + address.getCity());
        System.out.println("Zip Code: " + address.getZip_code());
        System.out.println("State: " + address.getState());
        System.out.println("Country: " + address.getCountry());
        
        System.out.println("*********************************************");
        System.out.println("\nDriver Information");
        System.out.println("\nFull Name: " + driver.getDrivername());
        System.out.println("License ID: " + driver.getDriverlicense());
        System.out.println("Contact: " + driver.getDrivercontact());
        
        System.out.println("*********************************************");
        System.out.println("\nVehicle Registration Information");
        System.out.println("\nVehicle Number: " + vehicle.getVehicleNo());
        System.out.println("Vehicle Model: " + vehicle.getModel());
        System.out.println("Serial Number: " + vehicle.getSerialNo());
        
        System.out.println("*********************************************");
        System.out.println("\nPatient Information");
        System.out.println("\nPatient ID: " + patient.getPatientid());
        System.out.println("Primary Doctor: " + patient.getPrimarydoc());
        System.out.println("Date of Last Visit: " + patient.getLastvisit());
        System.out.println("Date of Next Visit: " + patient.getNxtapt());
        System.out.println("Allergies: " + patient.getAllergies());
        System.out.println("onMedication: " + patient.getOnmedication());
        
        System.out.println("*********************************************");
        System.out.println("\nDoctor Information");
        System.out.println("\nDoctor ID: " + doctor.getDoctorId());
        System.out.println("Full Name: " + doctor.getDocName());
        System.out.println("Contact: " + doctor.getDocContact());
        System.out.println("Email: " + doctor.getDocEmail());
        System.out.println("Work Address: " + doctor.getOfficeAdd());
        System.out.println("Specialization: " + doctor.getSpecialty());
        System.out.println("Years of Practice: " + doctor.getDocYears());
        
        System.out.println("*********************************************");
        System.out.println("\nInsurance Coverage Information");
        System.out.println("\nCorporate ID: " + insurance.getCorporateID());
        System.out.println("Premium: " + insurance.getPremium());
        System.out.println("Deductable: " + insurance.getDeductable());
        System.out.println("Address: " + insurance.getCorporateAdd());
        System.out.println("Plan Name: " + insurance.getPlanName());
        System.out.println("Benefits: ");
             
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblDoctorDetails = new javax.swing.JLabel();
        lblDocName = new javax.swing.JLabel();
        lblDocAdd = new javax.swing.JLabel();
        lblDocSpecialize = new javax.swing.JLabel();
        lblDocID = new javax.swing.JLabel();
        lblDocContact = new javax.swing.JLabel();
        lblDocEmail = new javax.swing.JLabel();
        txtDocID = new javax.swing.JTextField();
        txtDocName = new javax.swing.JTextField();
        txtDocSpecialize = new javax.swing.JTextField();
        txtDocAdd = new javax.swing.JTextField();
        txtDocContact = new javax.swing.JTextField();
        txtDocEmail = new javax.swing.JTextField();
        lblPersonDetails = new javax.swing.JLabel();
        txtOccupation = new javax.swing.JTextField();
        txtNationality = new javax.swing.JTextField();
        txtPEmail = new javax.swing.JTextField();
        txtPContact = new javax.swing.JTextField();
        lblPName = new javax.swing.JLabel();
        lblNationality = new javax.swing.JLabel();
        lblOccupation = new javax.swing.JLabel();
        lblPAge = new javax.swing.JLabel();
        lblPContact = new javax.swing.JLabel();
        lblPEmail = new javax.swing.JLabel();
        txtPAge = new javax.swing.JTextField();
        txtPName = new javax.swing.JTextField();
        lblPDOB = new javax.swing.JLabel();
        txtPDOB = new javax.swing.JTextField();
        lblPSSN = new javax.swing.JLabel();
        txtPGender = new javax.swing.JTextField();
        lblPGender = new javax.swing.JLabel();
        txtPSSN = new javax.swing.JTextField();
        lblMaritalStatus = new javax.swing.JLabel();
        txtMaritalStatus = new javax.swing.JTextField();
        lblPatientDetails = new javax.swing.JLabel();
        lblPatientID = new javax.swing.JLabel();
        lblLastVisit = new javax.swing.JLabel();
        lblonMedication = new javax.swing.JLabel();
        lblNextVisit = new javax.swing.JLabel();
        txtLastVisit = new javax.swing.JTextField();
        txtPatientID = new javax.swing.JTextField();
        lblPrimaryDoc = new javax.swing.JLabel();
        txtPrimaryDoc = new javax.swing.JTextField();
        lblAllergies = new javax.swing.JLabel();
        txtNextVisit = new javax.swing.JTextField();
        lblCountry = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        lblLocation = new javax.swing.JLabel();
        txtState = new javax.swing.JTextField();
        lblState = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        txtCountry = new javax.swing.JTextField();
        txtLocation = new javax.swing.JTextField();
        lblReport = new javax.swing.JLabel();
        lblInsuranceCoverage = new javax.swing.JLabel();
        lblCorporateID = new javax.swing.JLabel();
        lblPremium = new javax.swing.JLabel();
        lblDeductable = new javax.swing.JLabel();
        txtCorporateID = new javax.swing.JTextField();
        lblCorporateAdd = new javax.swing.JLabel();
        txtCorporateAdd = new javax.swing.JTextField();
        txtPremium = new javax.swing.JTextField();
        txtDeductable = new javax.swing.JTextField();
        lblBenefits = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtareaBenefits = new javax.swing.JTextArea();
        lblHospitalService = new javax.swing.JLabel();
        lblDName = new javax.swing.JLabel();
        lblDLicense = new javax.swing.JLabel();
        lblModel = new javax.swing.JLabel();
        lblVehicleNo = new javax.swing.JLabel();
        txtDLicense = new javax.swing.JTextField();
        txtDName = new javax.swing.JTextField();
        lblDContact = new javax.swing.JLabel();
        txtDContact = new javax.swing.JTextField();
        txtVehicleNo = new javax.swing.JTextField();
        lblDriverVehicle = new javax.swing.JLabel();
        txtModel = new javax.swing.JTextField();
        lblSerialNo = new javax.swing.JLabel();
        txtSerialNo = new javax.swing.JTextField();
        lblZipCode = new javax.swing.JLabel();
        txtZipCode = new javax.swing.JTextField();
        txtYears = new javax.swing.JTextField();
        lblYears = new javax.swing.JLabel();
        txtAllergies = new javax.swing.JTextField();
        txtOnMedication = new javax.swing.JTextField();
        lblPicture = new javax.swing.JLabel();
        lblPic = new javax.swing.JLabel();
        lblPlanName = new javax.swing.JLabel();
        txtPremium1 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(153, 153, 255));
        setBorder(new javax.swing.border.MatteBorder(null));

        lblDoctorDetails.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lblDoctorDetails.setText("Doctor Details");

        lblDocName.setText("Full Name:");

        lblDocAdd.setText("Work Address:");

        lblDocSpecialize.setText("Specialization:");

        lblDocID.setText("Doctor ID:");

        lblDocContact.setText("Contact:");

        lblDocEmail.setText("Email:");

        txtDocName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocNameActionPerformed(evt);
            }
        });

        txtDocAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDocAddActionPerformed(evt);
            }
        });

        lblPersonDetails.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lblPersonDetails.setText("Visitor Person Details");

        lblPName.setText("Full Name:");

        lblNationality.setText("Nationality:");

        lblOccupation.setText("Occupation:");

        lblPAge.setText("Age:");

        lblPContact.setText("Contact:");

        lblPEmail.setText("Email:");

        txtPName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPNameActionPerformed(evt);
            }
        });

        lblPDOB.setText("Date of Birth:");

        txtPDOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPDOBActionPerformed(evt);
            }
        });

        lblPSSN.setText("SSN:");

        lblPGender.setText("Gender:");

        lblMaritalStatus.setText("Marital Status:");

        lblPatientDetails.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lblPatientDetails.setText("Report prepared for");

        lblPatientID.setText("Patient ID:");

        lblLastVisit.setText("Date of Last Visit:");

        lblonMedication.setText("onMedication:");

        lblNextVisit.setText("Date of Next Visit:");

        txtPatientID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPatientIDActionPerformed(evt);
            }
        });

        lblPrimaryDoc.setText("Primary Doctor:");

        txtPrimaryDoc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPrimaryDocActionPerformed(evt);
            }
        });

        lblAllergies.setText("Any Allergies:");

        lblCountry.setText("Country:");

        lblCity.setText("City:");

        lblLocation.setText("Location:");

        txtState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStateActionPerformed(evt);
            }
        });

        lblState.setText("State:");

        txtCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCountryActionPerformed(evt);
            }
        });

        lblReport.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblReport.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblReport.setText("PATIENT REPORT");

        lblInsuranceCoverage.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lblInsuranceCoverage.setText("Insurance Coverage Details of a Person");

        lblCorporateID.setText("Corporate ID:");

        lblPremium.setText("Premium:");

        lblDeductable.setText("Deductable:");

        txtCorporateID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorporateIDActionPerformed(evt);
            }
        });

        lblCorporateAdd.setText("Address:");

        txtCorporateAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorporateAddActionPerformed(evt);
            }
        });

        lblBenefits.setText("Benefits:");

        txtareaBenefits.setColumns(20);
        txtareaBenefits.setRows(5);
        txtareaBenefits.setText("1. This plan ensures that policyholders have access to the medical care they need \n    without the burden of high out-of-pocket costs, promoting peace of mind and \n    financial security.\n2. Policyholders under HealthGuard Plus have access to an extensive network of \n    healthcare providers, including hospitals, clinics, specialists, and primary care \n    physicians.");
        jScrollPane1.setViewportView(txtareaBenefits);

        lblHospitalService.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lblHospitalService.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHospitalService.setText("Hospital and Ambulance Service");

        lblDName.setText("Full Name:");

        lblDLicense.setText("Driving License ID:");

        lblModel.setText("Vehicle Model:");

        lblVehicleNo.setText("Vehicle Number:");

        txtDName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDNameActionPerformed(evt);
            }
        });

        lblDContact.setText("Contact:");

        txtDContact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDContactActionPerformed(evt);
            }
        });

        lblDriverVehicle.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        lblDriverVehicle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDriverVehicle.setText("Driver and Vehicle Details");

        lblSerialNo.setText("Serial Number:");

        lblZipCode.setText("Zip Code:");

        lblYears.setText("Years of Practice:");

        txtAllergies.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAllergiesActionPerformed(evt);
            }
        });

        txtOnMedication.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOnMedicationActionPerformed(evt);
            }
        });

        lblPicture.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        lblPicture.setText("Patient's Photo");

        lblPlanName.setText("Plan Name:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPatientDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblAllergies)
                                        .addGap(20, 20, 20))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblPrimaryDoc, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtPrimaryDoc)
                                    .addComponent(txtAllergies, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                                    .addComponent(txtPatientID))
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblLastVisit)
                                    .addComponent(lblNextVisit)
                                    .addComponent(lblonMedication))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNextVisit)
                                    .addComponent(txtLastVisit)
                                    .addComponent(txtOnMedication, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblDContact)
                                        .addComponent(lblVehicleNo))
                                    .addComponent(lblDName))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDName, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDContact, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtVehicleNo, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblSerialNo)
                                    .addComponent(lblModel)
                                    .addComponent(lblDLicense))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(txtModel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                                    .addComponent(txtDLicense, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSerialNo)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(lblDriverVehicle, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(lblReport, javax.swing.GroupLayout.PREFERRED_SIZE, 1133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblMaritalStatus)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtMaritalStatus))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblPName)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtPName, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblPDOB)
                                            .addComponent(lblPSSN)
                                            .addComponent(lblOccupation))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtPDOB, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtPSSN, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(txtOccupation, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblState)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblCity, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblPEmail)
                                            .addComponent(lblPContact)
                                            .addComponent(lblNationality, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblLocation)
                                            .addComponent(lblZipCode, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(lblCountry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(txtPContact)
                                                    .addComponent(txtNationality, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addComponent(txtPEmail, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(txtZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblPAge)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtPAge, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lblPGender)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtPGender, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(lblPersonDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addComponent(lblDoctorDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 563, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblDocSpecialize)
                                            .addComponent(lblDocName)
                                            .addComponent(lblDocID)
                                            .addComponent(lblDocAdd))
                                        .addGap(28, 28, 28)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtDocID, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtDocName, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtDocSpecialize, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(42, 42, 42)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(lblDocContact)
                                                    .addComponent(lblDocEmail)
                                                    .addComponent(lblYears))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(txtYears, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtDocEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(txtDocContact, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addComponent(txtDocAdd))
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblHospitalService, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(22, 22, 22))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDeductable)
                                    .addComponent(lblCorporateID)
                                    .addComponent(lblCorporateAdd)
                                    .addComponent(lblBenefits))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtCorporateAdd, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jScrollPane1)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtCorporateID, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtDeductable, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(50, 50, 50)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(lblPremium)
                                                .addGap(18, 18, 18))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(lblPlanName)
                                                .addGap(9, 9, 9)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(txtPremium1, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                            .addComponent(txtPremium))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(lblInsuranceCoverage, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblPicture)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(100, 100, 100)
                                .addComponent(lblPic, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblReport)
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPersonDetails)
                    .addComponent(lblHospitalService))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPName)
                            .addComponent(txtPName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPDOB)
                            .addComponent(txtPDOB, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPSSN)
                            .addComponent(txtPSSN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblOccupation)
                            .addComponent(txtOccupation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblMaritalStatus)
                            .addComponent(txtMaritalStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblPAge)
                            .addComponent(txtPAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPGender, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDoctorDetails))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lblDocID)
                                            .addComponent(txtDocID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lblDocName)
                                            .addComponent(txtDocName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(lblDocSpecialize)
                                            .addComponent(txtDocSpecialize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtDocContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblDocContact))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtDocEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblDocEmail))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txtYears, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lblYears))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblDocAdd)
                                    .addComponent(txtDocAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPEmail))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtPContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblPContact))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtNationality, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblNationality))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtLocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblLocation))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lblCity)
                                    .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblZipCode)
                                    .addComponent(txtZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblCountry)
                                    .addComponent(lblState)
                                    .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPatientDetails)
                    .addComponent(lblDriverVehicle))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLastVisit)
                            .addComponent(txtLastVisit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPatientID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPatientID))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNextVisit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblNextVisit)
                            .addComponent(txtPrimaryDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPrimaryDoc))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblonMedication)
                            .addComponent(lblAllergies)
                            .addComponent(txtAllergies, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtOnMedication, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDName)
                            .addComponent(lblDLicense)
                            .addComponent(txtDLicense, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDContact)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtDContact, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblModel)
                                .addComponent(txtModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblVehicleNo)
                                .addComponent(txtVehicleNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblSerialNo)
                                .addComponent(txtSerialNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblInsuranceCoverage)
                            .addComponent(lblPicture))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCorporateID)
                            .addComponent(txtCorporateID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPremium, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPremium))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDeductable)
                            .addComponent(txtDeductable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblPlanName)
                            .addComponent(txtPremium1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtCorporateAdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblCorporateAdd))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblBenefits)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(lblPic, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtDocNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocNameActionPerformed

    private void txtPNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPNameActionPerformed

    private void txtPDOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPDOBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPDOBActionPerformed

    private void txtPatientIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPatientIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPatientIDActionPerformed

    private void txtPrimaryDocActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPrimaryDocActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPrimaryDocActionPerformed

    private void txtStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtStateActionPerformed

    private void txtCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCountryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCountryActionPerformed

    private void txtCorporateIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorporateIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorporateIDActionPerformed

    private void txtCorporateAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorporateAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorporateAddActionPerformed

    private void txtDNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDNameActionPerformed

    private void txtDContactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDContactActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDContactActionPerformed

    private void txtDocAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDocAddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDocAddActionPerformed

    private void txtAllergiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAllergiesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAllergiesActionPerformed

    private void txtOnMedicationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOnMedicationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOnMedicationActionPerformed

    private void displayReport() {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        //Person
        txtPName.setText(person.getName());
        txtPDOB.setText(person.getDob());
        txtPAge.setText(person.getAge());
        txtPGender.setText(person.getGender());
        txtPSSN.setText(person.getSsn());
        txtPEmail.setText(person.getEmail());
        txtPContact.setText(person.getContact());
        txtOccupation.setText(person.getOccupation());
        txtNationality.setText(person.getNationality());
        txtMaritalStatus.setText(person.getMaritalstatus());
        
        //Address
        txtLocation.setText(address.getLocation());
        txtCity.setText(address.getCity());
        txtCountry.setText(address.getCountry());
        txtZipCode.setText(address.getZip_code());
        txtState.setText(address.getState());
        
        //Driver
        txtDName.setText(driver.getDrivername());
        txtDLicense.setText(driver.getDriverlicense());
        txtDContact.setText(driver.getDrivercontact());
        
        //Vehicle Registration
        txtVehicleNo.setText(vehicle.getVehicleNo());
        txtModel.setText(vehicle.getModel());
        txtSerialNo.setText(vehicle.getSerialNo());
        
        //Patient
        txtPatientID.setText(patient.getPatientid());
        txtPrimaryDoc.setText(patient.getPrimarydoc());
        txtLastVisit.setText(patient.getLastvisit());
        txtNextVisit.setText(patient.getNxtapt());
        txtAllergies.setText(patient.getAllergies());
        txtOnMedication.setText(patient.getOnmedication());
        
        //Doctor
        txtDocName.setText(doctor.getDocName());
        txtDocID.setText(doctor.getDoctorId());
        txtDocAdd.setText(doctor.getOfficeAdd());
        txtDocSpecialize.setText(doctor.getSpecialty());
        txtDocContact.setText(doctor.getDocContact());
        txtDocEmail.setText(doctor.getDocEmail());
        txtYears.setText(doctor.getDocYears());
        
        //Insurance Coverage
        txtCorporateID.setText(insurance.getCorporateID());
        txtCorporateAdd.setText(insurance.getCorporateAdd());
        txtPremium.setText(insurance.getPremium());
        txtDeductable.setText(insurance.getDeductable());
        txtPremium1.setText(insurance.getPlanName());
        
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAllergies;
    private javax.swing.JLabel lblBenefits;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblCorporateAdd;
    private javax.swing.JLabel lblCorporateID;
    private javax.swing.JLabel lblCountry;
    private javax.swing.JLabel lblDContact;
    private javax.swing.JLabel lblDLicense;
    private javax.swing.JLabel lblDName;
    private javax.swing.JLabel lblDeductable;
    private javax.swing.JLabel lblDocAdd;
    private javax.swing.JLabel lblDocContact;
    private javax.swing.JLabel lblDocEmail;
    private javax.swing.JLabel lblDocID;
    private javax.swing.JLabel lblDocName;
    private javax.swing.JLabel lblDocSpecialize;
    private javax.swing.JLabel lblDoctorDetails;
    private javax.swing.JLabel lblDriverVehicle;
    private javax.swing.JLabel lblHospitalService;
    private javax.swing.JLabel lblInsuranceCoverage;
    private javax.swing.JLabel lblLastVisit;
    private javax.swing.JLabel lblLocation;
    private javax.swing.JLabel lblMaritalStatus;
    private javax.swing.JLabel lblModel;
    private javax.swing.JLabel lblNationality;
    private javax.swing.JLabel lblNextVisit;
    private javax.swing.JLabel lblOccupation;
    private javax.swing.JLabel lblPAge;
    private javax.swing.JLabel lblPContact;
    private javax.swing.JLabel lblPDOB;
    private javax.swing.JLabel lblPEmail;
    private javax.swing.JLabel lblPGender;
    private javax.swing.JLabel lblPName;
    private javax.swing.JLabel lblPSSN;
    private javax.swing.JLabel lblPatientDetails;
    private javax.swing.JLabel lblPatientID;
    private javax.swing.JLabel lblPersonDetails;
    private javax.swing.JLabel lblPic;
    private javax.swing.JLabel lblPicture;
    private javax.swing.JLabel lblPlanName;
    private javax.swing.JLabel lblPremium;
    private javax.swing.JLabel lblPrimaryDoc;
    private javax.swing.JLabel lblReport;
    private javax.swing.JLabel lblSerialNo;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblVehicleNo;
    private javax.swing.JLabel lblYears;
    private javax.swing.JLabel lblZipCode;
    private javax.swing.JLabel lblonMedication;
    private javax.swing.JTextField txtAllergies;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtCorporateAdd;
    private javax.swing.JTextField txtCorporateID;
    private javax.swing.JTextField txtCountry;
    private javax.swing.JTextField txtDContact;
    private javax.swing.JTextField txtDLicense;
    private javax.swing.JTextField txtDName;
    private javax.swing.JTextField txtDeductable;
    private javax.swing.JTextField txtDocAdd;
    private javax.swing.JTextField txtDocContact;
    private javax.swing.JTextField txtDocEmail;
    private javax.swing.JTextField txtDocID;
    private javax.swing.JTextField txtDocName;
    private javax.swing.JTextField txtDocSpecialize;
    private javax.swing.JTextField txtLastVisit;
    private javax.swing.JTextField txtLocation;
    private javax.swing.JTextField txtMaritalStatus;
    private javax.swing.JTextField txtModel;
    private javax.swing.JTextField txtNationality;
    private javax.swing.JTextField txtNextVisit;
    private javax.swing.JTextField txtOccupation;
    private javax.swing.JTextField txtOnMedication;
    private javax.swing.JTextField txtPAge;
    private javax.swing.JTextField txtPContact;
    private javax.swing.JTextField txtPDOB;
    private javax.swing.JTextField txtPEmail;
    private javax.swing.JTextField txtPGender;
    private javax.swing.JTextField txtPName;
    private javax.swing.JTextField txtPSSN;
    private javax.swing.JTextField txtPatientID;
    private javax.swing.JTextField txtPremium;
    private javax.swing.JTextField txtPremium1;
    private javax.swing.JTextField txtPrimaryDoc;
    private javax.swing.JTextField txtSerialNo;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextField txtVehicleNo;
    private javax.swing.JTextField txtYears;
    private javax.swing.JTextField txtZipCode;
    private javax.swing.JTextArea txtareaBenefits;
    // End of variables declaration//GEN-END:variables
}
