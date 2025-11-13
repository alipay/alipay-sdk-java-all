package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 健康史
 *
 * @author auto create
 * @since 1.0, 2025-10-29 15:52:40
 */
public class HealthHistory extends AlipayObject {

	private static final long serialVersionUID = 2551811217779155181L;

	/**
	 * 饮酒史
	 */
	@ApiField("alcohol_history")
	private AlcoholHistory alcoholHistory;

	/**
	 * null
	 */
	@ApiListField("allergy_history_list")
	@ApiField("allergy_history")
	private List<AllergyHistory> allergyHistoryList;

	/**
	 * null
	 */
	@ApiListField("disease_history_list")
	@ApiField("disease_history")
	private List<DiseaseHistory> diseaseHistoryList;

	/**
	 * null
	 */
	@ApiListField("family_history_list")
	@ApiField("family_history")
	private List<FamilyHistory> familyHistoryList;

	/**
	 * null
	 */
	@ApiListField("medicine_history_list")
	@ApiField("medicine_history")
	private List<MedicineHistory> medicineHistoryList;

	/**
	 * 孕产史
	 */
	@ApiField("pregnancy_history")
	private PregnancyHistory pregnancyHistory;

	/**
	 * 吸烟史
	 */
	@ApiField("smoking_history")
	private SmokingHistory smokingHistory;

	/**
	 * null
	 */
	@ApiListField("surgical_history_list")
	@ApiField("surgical_history")
	private List<SurgicalHistory> surgicalHistoryList;

	/**
	 * null
	 */
	@ApiListField("vaccination_history_list")
	@ApiField("vaccination_history")
	private List<VaccinationHistory> vaccinationHistoryList;

	public AlcoholHistory getAlcoholHistory() {
		return this.alcoholHistory;
	}
	public void setAlcoholHistory(AlcoholHistory alcoholHistory) {
		this.alcoholHistory = alcoholHistory;
	}

	public List<AllergyHistory> getAllergyHistoryList() {
		return this.allergyHistoryList;
	}
	public void setAllergyHistoryList(List<AllergyHistory> allergyHistoryList) {
		this.allergyHistoryList = allergyHistoryList;
	}

	public List<DiseaseHistory> getDiseaseHistoryList() {
		return this.diseaseHistoryList;
	}
	public void setDiseaseHistoryList(List<DiseaseHistory> diseaseHistoryList) {
		this.diseaseHistoryList = diseaseHistoryList;
	}

	public List<FamilyHistory> getFamilyHistoryList() {
		return this.familyHistoryList;
	}
	public void setFamilyHistoryList(List<FamilyHistory> familyHistoryList) {
		this.familyHistoryList = familyHistoryList;
	}

	public List<MedicineHistory> getMedicineHistoryList() {
		return this.medicineHistoryList;
	}
	public void setMedicineHistoryList(List<MedicineHistory> medicineHistoryList) {
		this.medicineHistoryList = medicineHistoryList;
	}

	public PregnancyHistory getPregnancyHistory() {
		return this.pregnancyHistory;
	}
	public void setPregnancyHistory(PregnancyHistory pregnancyHistory) {
		this.pregnancyHistory = pregnancyHistory;
	}

	public SmokingHistory getSmokingHistory() {
		return this.smokingHistory;
	}
	public void setSmokingHistory(SmokingHistory smokingHistory) {
		this.smokingHistory = smokingHistory;
	}

	public List<SurgicalHistory> getSurgicalHistoryList() {
		return this.surgicalHistoryList;
	}
	public void setSurgicalHistoryList(List<SurgicalHistory> surgicalHistoryList) {
		this.surgicalHistoryList = surgicalHistoryList;
	}

	public List<VaccinationHistory> getVaccinationHistoryList() {
		return this.vaccinationHistoryList;
	}
	public void setVaccinationHistoryList(List<VaccinationHistory> vaccinationHistoryList) {
		this.vaccinationHistoryList = vaccinationHistoryList;
	}

}
