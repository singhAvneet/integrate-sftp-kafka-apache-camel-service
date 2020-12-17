package com.kafka.ClaimParser;

import java.util.Arrays;
import java.util.List;

public class PharmacyClaimFileFormat {
    List<Integer> RecordTypePOS = Arrays.asList(0,1);
    List<Integer> VCSAssignedClaimReferenceNumberPOS = Arrays.asList(1,11);
    List<Integer> PharmacyTraceNumberPOS = Arrays.asList(11,17);
    List<Integer> DateClaimReceivedatESICanadaPOS = Arrays.asList(17,25);
    List<Integer> DateProcessedOrAdjudicatedPOS = Arrays.asList(25,33);
    List<Integer> ClaimStatusPOS = Arrays.asList(33,34);
    List<Integer> CommunicationsFlagPOS = Arrays.asList(34,35);
    List<Integer> ClientLanguageFlagPOS = Arrays.asList(35,36);
    List<Integer> PharmacyNumberPOS = Arrays.asList(36,46);
    List<Integer> PrescriptionNumberPOS = Arrays.asList(46,53);
    List<Integer> CurrentRxNumberPOS = Arrays.asList(53,60);
    List<Integer> DateofServicePOS = Arrays.asList(60,68);
    List<Integer> DrugCodeOrGPNumberOrCompoundCodePOS = Arrays.asList(68,76);
    List<Integer> DrugDescriptionEnglishPOS = Arrays.asList(76,106);
    List<Integer> DrugDescriptionFrenchPOS = Arrays.asList(106,136);
    List<Integer> NewOrRefillCodePOS = Arrays.asList(136,138);
    List<Integer> MajorCompoundIngredientPOS = Arrays.asList(138,146);
    List<Integer> MetricQuantityPOS = Arrays.asList(146,151);
    List<Integer> DaysSupplyPOS = Arrays.asList(151,154);
    List<Integer> ClientLastNamePOS = Arrays.asList(154,169);
    List<Integer> ClientFirstNamePOS = Arrays.asList(169,181);
    List<Integer> PatientLastNamePOS = Arrays.asList(181,196);
    List<Integer> PatientFirstNamePOS = Arrays.asList(196,208);
    List<Integer> PatientDateofBirthPOS = Arrays.asList(208,216);
    List<Integer> SexofPatientPOS = Arrays.asList(216,217);
    List<Integer> CustomerIDPOS = Arrays.asList(217,219);
    List<Integer> GSASPOS = Arrays.asList(219, 238);
    List<Integer> ClientIDPOS = Arrays.asList(238, 253);
    List<Integer> PatientCodePOS = Arrays.asList(253, 256);
    List<Integer> PatientRelationshipCodePOS = Arrays.asList(256, 257);
    List<Integer> ProductSelectionCodePOS = Arrays.asList(257, 258);
    List<Integer> SubmittedIngredientCostPOS = Arrays.asList(258, 264);
    List<Integer> SubmittedCostUpChargePOS = Arrays.asList(264, 270);
    List<Integer> SubmittedProvincialTaxPOS = Arrays.asList(270, 276);
    List<Integer> SubmittedGSTPOS = Arrays.asList(276, 282);
    List<Integer> SubmittedProfessionalFeePOS = Arrays.asList(282, 288);
    List<Integer> SubmittedGenericIncentivePOS = Arrays.asList(288, 294);
    List<Integer> SubmittedSpecialServicesFeePOS = Arrays.asList(294, 300);
    List<Integer> SubmittedCompoundingFeePOS = Arrays.asList(300, 306);
    List<Integer> SubmittedCopayPOS = Arrays.asList(306, 312);
    List<Integer> SubmittedCoinsurancePOS = Arrays.asList(312, 318);
    List<Integer> SubmittedTotalAmountClaimedPOS = Arrays.asList(318, 324);
    List<Integer> PayableIngredientCostPOS = Arrays.asList(324, 330);
    List<Integer> PayableCostUpChargePOS = Arrays.asList(330, 336);
    List<Integer> PayableProvincialSalesTaxPOS = Arrays.asList(336, 342);
    List<Integer> PayableGSTTaxPOS = Arrays.asList(342, 348);
    List<Integer> PayableProfessionalFeePOS = Arrays.asList(348, 354);
    List<Integer> PayableGenericIncentivePOS = Arrays.asList(354, 360);
    List<Integer> PayableSpecialServicesFeePOS = Arrays.asList(360, 366);
    List<Integer> PayableCompoundingFeePOS = Arrays.asList(366, 372);
    List<Integer> PayableCopayAmountPOS = Arrays.asList(372, 378);
    List<Integer> PayableCoinsurancePOS = Arrays.asList(378, 384);
    List<Integer> PayableTotalAmountPOS = Arrays.asList(384, 390);
    List<Integer> AmountTowardCostPlusPOS = Arrays.asList(390, 396);
    List<Integer> AmountTowardAnnualDeductibleFamilyPOS = Arrays.asList(396, 402);
    List<Integer> AmountTowardAnnualDeductibleIndividualOrFamilyPOS = Arrays.asList(402, 408);
    List<Integer> AmountTowardAnnualDeductibleSinglePOS = Arrays.asList(408, 414);
    List<Integer> AnnualDeductibleAmountSatisfiedFamilyPOS = Arrays.asList(414, 420 );
    List<Integer> AnnualDeductibleAmountSatisfiedIndividualOrFamilyPOS = Arrays.asList(420, 426);
    List<Integer> AnnualDeductibleAmountSatisfiedSinglePOS = Arrays.asList(426, 432);
    List<Integer> TestIndicatorPOS = Arrays.asList(432, 433);
    List<Integer> ErrorCodesPOS = Arrays.asList(433, 445);
    List<Integer> CostBasisPOS = Arrays.asList(445, 447);
    List<Integer> UnitPricePOS = Arrays.asList(447, 456);
    List<Integer> MaximumAllowableCostPOS = Arrays.asList(456, 465);
    List<Integer> CostDifferencePOS = Arrays.asList(465, 471);
    List<Integer> TherapeuticClassPOS = Arrays.asList(471, 477);
    List<Integer> ClassPOS = Arrays.asList(477, 478);
    List<Integer> ProvincialSchedulePOS = Arrays.asList(478, 480);
    List<Integer> DosageFormPOS = Arrays.asList(480, 482);
    List<Integer> RouteofAdministrationPOS = Arrays.asList(482, 483);
    List<Integer> SubmissionMethodCodePOS = Arrays.asList(483, 484);
    List<Integer> PayeeCodePOS = Arrays.asList(484, 485);
    List<Integer> PaymentMethodPOS = Arrays.asList(485, 486);
    List<Integer> AuthorizationCodePOS = Arrays.asList(486, 493);
    List<Integer> AuthorizationNumberPOS = Arrays.asList(493, 499);
    List<Integer> EFTNumberPOS = Arrays.asList(499, 518);
    List<Integer> DeductibleSatisfiedFlagPOS = Arrays.asList(518, 519);
    List<Integer> NextRolloverDatePOS = Arrays.asList(519, 527);
    List<Integer> PaymentStatusPOS = Arrays.asList(527, 528);
    List<Integer> OriginalClaimReferenceNumberPOS = Arrays.asList(528, 538);
    List<Integer> OriginalClaimTraceNumberPOS = Arrays.asList(538, 544);
    List<Integer> ClientLocationPOS = Arrays.asList(544, 550);
    List<Integer> ReimbursementFlagPOS = Arrays.asList(550, 551);
    List<Integer> PrescriberNumberPOS = Arrays.asList(551, 561);
    List<Integer> ProviderCodePOS = Arrays.asList(561, 563);
    List<Integer> ProviderZonePOS = Arrays.asList(563, 565);
    List<Integer> RefillsAuthorizedPOS = Arrays.asList(565, 567);
    List<Integer> DINProductNamePOS = Arrays.asList(567, 577);
    List<Integer> RefillOrRepeatAuthorizationsPOS = Arrays.asList(577, 579);
    List<Integer> ProvincialHealthCareIDPOS = Arrays.asList(579, 592);
    List<Integer> UnlistedCompoundPOS = Arrays.asList(592, 593);
    List<Integer> InterventionCodesPOS = Arrays.asList(593, 597);
    List<Integer> PreviouslyPaidPOS = Arrays.asList(597, 603);
    List<Integer> PharmacistIDPOS = Arrays.asList(603, 609);
    List<Integer> CPhAVersionNumberPOS = Arrays.asList(609, 611);
    List<Integer> ESICodePOS = Arrays.asList(611, 613);
    List<Integer> AQPPCodePOS = Arrays.asList(613, 616);
    List<Integer> OriginalRxNumberPOS = Arrays.asList(617, 626);
    List<Integer> CurrentRxNumberV3POS = Arrays.asList(626, 635);
    List<Integer> NewOrRefillCodeV3POS = Arrays.asList(635, 636);
    List<Integer> MetricQuantityClaimedPOS = Arrays.asList(636, 642);
    List<Integer> MetricQuantityPaidPOS = Arrays.asList(642, 648);
    List<Integer> MedicalReasonReferencePOS = Arrays.asList(648, 649);
    List<Integer> MedicalConditionPOS = Arrays.asList(649, 655);
    List<Integer> ProviderSoftwareIDPOS = Arrays.asList(655, 658);
    List<Integer> POSDeviceIDPOS = Arrays.asList(658, 666);
    List<Integer> PrescriberIDReferencePOS = Arrays.asList(666, 668);
    List<Integer> CPhAResponseCodesPOS = Arrays.asList(668, 678);
    List<Integer> DosagePOS = Arrays.asList(678, 686);
    List<Integer> FormularyDrugIndicatorPOS = Arrays.asList(686, 687);
    List<Integer> AttachmentCodePOS = Arrays.asList(687, 690);
    List<Integer> DiseaseCodePOS = Arrays.asList(690, 696);
    List<Integer> COBRuleNumberPOS = Arrays.asList(696, 697);
    List<Integer> GeneralCodePOS = Arrays.asList(697, 698);
    List<Integer> GenProdIndicatorPOS = Arrays.asList(698, 699);
    List<Integer> PrescriberIDPOS = Arrays.asList(699, 714);
    List<Integer> PrescriberReferenceCodePOS = Arrays.asList(714, 716);
    List<Integer> DeductPaidPOS = Arrays.asList(716, 722);
    List<Integer> AccumIDPOS = Arrays.asList(722, 727);
    List<Integer> DeferredCdPOS = Arrays.asList(727, 728);
    List<Integer> AlternateIdentificationPOS = Arrays.asList(728, 744);
    List<Integer> LineofBusinessPOS = Arrays.asList(744, 747);

    public Integer GetRecordType (String claim) { return ParseInteger(RecordTypePOS, claim); }
    public String GetVCSAssignedClaimReferenceNumber (String claim) { return ParseString(VCSAssignedClaimReferenceNumberPOS, claim); }
    public String GetPharmacyTraceNumber (String claim) { return ParseString(PharmacyTraceNumberPOS, claim); }
    public Integer GetDateClaimReceivedatESICanada (String claim) { return ParseInteger(DateClaimReceivedatESICanadaPOS, claim); }
    public Integer GetDateProcessedOrAdjudicated (String claim) { return ParseInteger(DateProcessedOrAdjudicatedPOS, claim); }
    public Integer GetClaimStatus (String claim) { return ParseInteger(ClaimStatusPOS, claim); }
    public Integer GetCommunicationsFlag (String claim) { return ParseInteger(CommunicationsFlagPOS, claim); }
    public String GetClientLanguageFlag (String claim) { return ParseString(ClientLanguageFlagPOS, claim); }
    public String GetPharmacyNumber (String claim) { return ParseString(PharmacyNumberPOS, claim); }
    public String GetPrescriptionNumber (String claim) { return ParseString(PrescriptionNumberPOS, claim); }
    public String GetCurrentRxNumber (String claim) { return ParseString(CurrentRxNumberPOS, claim); }
    public Integer GetDateofService (String claim) { return ParseInteger(DateofServicePOS, claim); }
    public String GetDrugCodeOrGPNumberOrCompoundCode (String claim) { return ParseString(DrugCodeOrGPNumberOrCompoundCodePOS, claim); }
    public String GetDrugDescriptionEnglish (String claim) { return ParseString(DrugDescriptionEnglishPOS, claim); }
    public String GetDrugDescriptionFrench (String claim) { return ParseString(DrugDescriptionFrenchPOS, claim); }
    public Integer GetNewOrRefillCode (String claim) { return ParseInteger(NewOrRefillCodePOS, claim); }
    public Integer GetMajorCompoundIngredient (String claim) { return ParseInteger(MajorCompoundIngredientPOS, claim); }
    public Integer GetMetricQuantity (String claim) { return ParseInteger(MetricQuantityPOS, claim); }
    public Integer GetDaysSupply (String claim) { return ParseInteger(DaysSupplyPOS, claim); }
    public String GetClientLastName (String claim) { return ParseString(ClientLastNamePOS, claim); }
    public String GetClientFirstName (String claim) { return ParseString(ClientFirstNamePOS, claim); }
    public String GetPatientLastName (String claim) { return ParseString(PatientLastNamePOS, claim); }
    public String GetPatientFirstName (String claim) { return ParseString(PatientFirstNamePOS, claim); }
    public Integer GetPatientDateofBirth (String claim) { return ParseInteger(PatientDateofBirthPOS, claim); }
    public String GetSexofPatient (String claim) { return ParseString(SexofPatientPOS, claim); }
    public Integer GetCustomerID (String claim) { return ParseInteger(CustomerIDPOS, claim); }
    public String GetGSAS (String claim) { return ParseString(GSASPOS, claim); }
    public String GetClientID (String claim) { return ParseString(ClientIDPOS, claim); }
    public String GetPatientCode (String claim) { return ParseString(PatientCodePOS, claim); }
    public Integer GetPatientRelationshipCode (String claim) { return ParseInteger(PatientRelationshipCodePOS, claim); }
    public String GetProductSelectionCode (String claim) { return ParseString(ProductSelectionCodePOS, claim); }
    public Integer GetSubmittedIngredientCost (String claim) { return ParseInteger(SubmittedIngredientCostPOS, claim); }
    public Integer GetSubmittedCostUpCharge (String claim) { return ParseInteger(SubmittedCostUpChargePOS, claim); }
    public Integer GetSubmittedProvincialTax (String claim) { return ParseInteger(SubmittedProvincialTaxPOS, claim); }
    public Integer GetSubmittedGST (String claim) { return ParseInteger(SubmittedGSTPOS, claim); }
    public Integer GetSubmittedProfessionalFee (String claim) { return ParseInteger(SubmittedProfessionalFeePOS, claim); }
    public Integer GetSubmittedGenericIncentive (String claim) { return ParseInteger(SubmittedGenericIncentivePOS, claim); }
    public Integer GetSubmittedSpecialServicesFee (String claim) { return ParseInteger(SubmittedSpecialServicesFeePOS, claim); }
    public Integer GetSubmittedCompoundingFee (String claim) { return ParseInteger(SubmittedCompoundingFeePOS, claim); }
    public Integer GetSubmittedCopay (String claim) { return ParseInteger(SubmittedCopayPOS, claim); }
    public Integer GetSubmittedCoinsurance (String claim) { return ParseInteger(SubmittedCoinsurancePOS, claim); }
    public Integer GetSubmittedTotalAmountClaimed (String claim) { return ParseInteger(SubmittedTotalAmountClaimedPOS, claim); }
    public Integer GetPayableIngredientCost (String claim) { return ParseInteger(PayableIngredientCostPOS, claim); }
    public Integer GetPayableCostUpCharge (String claim) { return ParseInteger(PayableCostUpChargePOS, claim); }
    public Integer GetPayableProvincialSalesTax (String claim) { return ParseInteger(PayableProvincialSalesTaxPOS, claim); }
    public Integer GetPayableGSTTax (String claim) { return ParseInteger(PayableGSTTaxPOS, claim); }
    public Integer GetPayableProfessionalFee (String claim) { return ParseInteger(PayableProfessionalFeePOS, claim); }
    public Integer GetPayableGenericIncentive (String claim) { return ParseInteger(PayableGenericIncentivePOS, claim); }
    public Integer GetPayableSpecialServicesFee (String claim) { return ParseInteger(PayableSpecialServicesFeePOS, claim); }
    public Integer GetPayableCompoundingFee (String claim) { return ParseInteger(PayableCompoundingFeePOS, claim); }
    public Integer GetPayableCopayAmount (String claim) { return ParseInteger(PayableCopayAmountPOS, claim); }
    public Integer GetPayableCoinsurance (String claim) { return ParseInteger(PayableCoinsurancePOS, claim); }
    public Integer GetPayableTotalAmount (String claim) { return ParseInteger(PayableTotalAmountPOS, claim); }
    public Integer GetAmountTowardCostPlus (String claim) { return ParseInteger(AmountTowardCostPlusPOS, claim); }
    public Integer GetAmountTowardAnnualDeductibleFamily (String claim) { return ParseInteger(AmountTowardAnnualDeductibleFamilyPOS, claim); }
    public Integer GetAmountTowardAnnualDeductibleIndividualOrFamily (String claim) { return ParseInteger(AmountTowardAnnualDeductibleIndividualOrFamilyPOS, claim); }
    public Integer GetAmountTowardAnnualDeductibleSingle (String claim) { return ParseInteger(AmountTowardAnnualDeductibleSinglePOS, claim); }
    public Integer GetAnnualDeductibleAmountSatisfiedFamily (String claim) { return ParseInteger(AnnualDeductibleAmountSatisfiedFamilyPOS, claim); }
    public Integer GetAnnualDeductibleAmountSatisfiedIndividualOrFamily (String claim) { return ParseInteger(AnnualDeductibleAmountSatisfiedIndividualOrFamilyPOS, claim); }
    public Integer GetAnnualDeductibleAmountSatisfiedSingle (String claim) { return ParseInteger(AnnualDeductibleAmountSatisfiedSinglePOS, claim); }
    public String GetTestIndicator (String claim) { return ParseString(TestIndicatorPOS, claim); }
    public String GetErrorCodes (String claim) { return ParseString(ErrorCodesPOS, claim); }
    public String GetCostBasis (String claim) { return ParseString(CostBasisPOS, claim); }
    public Integer GetUnitPrice (String claim) { return ParseInteger(UnitPricePOS, claim); }
    public Integer GetMaximumAllowableCost (String claim) { return ParseInteger(MaximumAllowableCostPOS, claim); }
    public Integer GetCostDifference (String claim) { return ParseInteger(CostDifferencePOS, claim); }
    public Integer GetTherapeuticClass (String claim) { return ParseInteger(TherapeuticClassPOS, claim); }
    public String GetClass (String claim) { return ParseString(ClassPOS, claim); }
    public String GetProvincialSchedule (String claim) { return ParseString(ProvincialSchedulePOS, claim); }
    public String GetDosageForm (String claim) { return ParseString(DosageFormPOS, claim); }
    public String GetRouteofAdministration (String claim) { return ParseString(RouteofAdministrationPOS, claim); }
    public Integer GetSubmissionMethodCode (String claim) { return ParseInteger(SubmissionMethodCodePOS, claim); }
    public Integer GetPayeeCode (String claim) { return ParseInteger(PayeeCodePOS, claim); }
    public Integer GetPaymentMethod (String claim) { return ParseInteger(PaymentMethodPOS, claim); }
    public Integer GetAuthorizationCode (String claim) { return ParseInteger(AuthorizationCodePOS, claim); }
    public Integer GetAuthorizationNumber (String claim) { return ParseInteger(AuthorizationNumberPOS, claim); }
    public String GetEFTNumber (String claim) { return ParseString(EFTNumberPOS, claim); }
    public String GetDeductibleSatisfiedFlag (String claim) { return ParseString(DeductibleSatisfiedFlagPOS, claim); }
    public Integer GetNextRolloverDate (String claim) { return ParseInteger(NextRolloverDatePOS, claim); }
    public String GetPaymentStatus (String claim) { return ParseString(PaymentStatusPOS, claim); }
    public String GetOriginalClaimReferenceNumber (String claim) { return ParseString(OriginalClaimReferenceNumberPOS, claim); }
    public String GetOriginalClaimTraceNumber (String claim) { return ParseString(OriginalClaimTraceNumberPOS, claim); }
    public String GetClientLocation (String claim) { return ParseString(ClientLocationPOS, claim); }
    public String GetReimbursementFlag (String claim) { return ParseString(ReimbursementFlagPOS, claim); }
    public String GetPrescriberNumber (String claim) { return ParseString(PrescriberNumberPOS, claim); }
    public Integer GetProviderCode (String claim) { return ParseInteger(ProviderCodePOS, claim); }
    public Integer GetProviderZone (String claim) { return ParseInteger(ProviderZonePOS, claim); }
    public Integer GetRefillsAuthorized (String claim) { return ParseInteger(RefillsAuthorizedPOS, claim); }
    public String GetDINProductName (String claim) { return ParseString(DINProductNamePOS, claim); }
    public Integer GetRefillOrRepeatAuthorizations (String claim) { return ParseInteger(RefillOrRepeatAuthorizationsPOS, claim); }
    public String GetProvincialHealthCareID (String claim) { return ParseString(ProvincialHealthCareIDPOS, claim); }
    public String GetUnlistedCompound (String claim) { return ParseString(UnlistedCompoundPOS, claim); }
    public String GetInterventionCodes (String claim) { return ParseString(InterventionCodesPOS, claim); }
    public Integer GetPreviouslyPaid (String claim) { return ParseInteger(PreviouslyPaidPOS, claim); }
    public String GetPharmacistID (String claim) { return ParseString(PharmacistIDPOS, claim); }
    public Integer GetCPhAVersionNumber (String claim) { return ParseInteger(CPhAVersionNumberPOS, claim); }
    public String GetESICode (String claim) { return ParseString(ESICodePOS, claim); }
    public String GetAQPPCode (String claim) { return ParseString(AQPPCodePOS, claim); }
    public String GetOriginalRxNumber (String claim) { return ParseString(OriginalRxNumberPOS, claim); }
    public String GetCurrentRxNumberV3 (String claim) { return ParseString(CurrentRxNumberV3POS, claim); }
    public String GetNewOrRefillCodeV3 (String claim) { return ParseString(NewOrRefillCodeV3POS, claim); }
    public Integer GetMetricQuantityClaimed (String claim) { return ParseInteger(MetricQuantityClaimedPOS, claim); }
    public Integer GetMetricQuantityPaid (String claim) { return ParseInteger(MetricQuantityPaidPOS, claim); }
    public String GetMedicalReasonReference (String claim) { return ParseString(MedicalReasonReferencePOS, claim); }
    public String GetMedicalCondition (String claim) { return ParseString(MedicalConditionPOS, claim); }
    public String GetProviderSoftwareID (String claim) { return ParseString(ProviderSoftwareIDPOS, claim); }
    public String GetPOSDeviceID (String claim) { return ParseString(POSDeviceIDPOS, claim); }
    public String GetPrescriberIDReference (String claim) { return ParseString(PrescriberIDReferencePOS, claim); }
    public String GetCPhAResponseCodes (String claim) { return ParseString(CPhAResponseCodesPOS, claim); }
    public String GetDosage (String claim) { return ParseString(DosagePOS, claim); }
    public String GetFormularyDrugIndicator (String claim) { return ParseString(FormularyDrugIndicatorPOS, claim); }
    public String GetAttachmentCode (String claim) { return ParseString(AttachmentCodePOS, claim); }
    public Integer GetDiseaseCode (String claim) { return ParseInteger(DiseaseCodePOS, claim); }
    public String GetCOBRuleNumber (String claim) { return ParseString(COBRuleNumberPOS, claim); }
    public String GetGeneralCode (String claim) { return ParseString(GeneralCodePOS, claim); }
    public String GetGenProdIndicator (String claim) { return ParseString(GenProdIndicatorPOS, claim); }
    public String GetPrescriberID (String claim) { return ParseString(PrescriberIDPOS, claim); }
    public String GetPrescriberReferenceCode (String claim) { return ParseString(PrescriberReferenceCodePOS, claim); }
    public Integer GetDeductPaid (String claim) { return ParseInteger(DeductPaidPOS, claim); }
    public String GetAccumID (String claim) { return ParseString(AccumIDPOS, claim); }
    public String GetDeferredCd (String claim) { return ParseString(DeferredCdPOS, claim); }
    public String GetAlternateIdentification (String claim) { return ParseString(AlternateIdentificationPOS, claim); }
    public String GetLineofBusiness (String claim) { return ParseString(LineofBusinessPOS, claim); }

    private String ParseString(List<Integer> range, String claim) {
        return claim.substring(range.get(0), range.get(1));
    }

    private Integer ParseInteger(List<Integer> range, String claim) {
        return Integer.parseInt(claim.substring(range.get(0), range.get(1)));
    }
}
