package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.YpzAfuDownloadCardOne;
import com.alipay.api.domain.YpzCloudDispenseMedicineCardOne;
import com.alipay.api.domain.YpzCloudDispenseMedicineHomeCardOne;
import com.alipay.api.domain.YpzDoctorAgentCardOne;
import com.alipay.api.domain.YpzMedAccompanyCardOne;
import com.alipay.api.domain.YpzNpsCardOne;
import com.alipay.api.domain.YpzOfflineQrCodeCardOne;
import com.alipay.api.domain.YpzQaCardOne;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.commerce.medical.ypz.recommendcard.query response.
 * 
 * @author auto create
 * @since 1.0, 2026-07-07 14:32:58
 */
public class AlipayCommerceMedicalYpzRecommendcardQueryResponse extends AlipayResponse {

	private static final long serialVersionUID = 3124385917499284633L;

	/** 
	 * 阿福带下载卡
	 */
	@ApiField("afu_download_card")
	private YpzAfuDownloadCardOne afuDownloadCard;

	/** 
	 * 云陪诊云配药卡
	 */
	@ApiField("cloud_dispense_medicine_card")
	private YpzCloudDispenseMedicineCardOne cloudDispenseMedicineCard;

	/** 
	 * null
	 */
	@ApiListField("cloud_dispense_medicine_home_card")
	@ApiField("ypz_cloud_dispense_medicine_home_card_one")
	private List<YpzCloudDispenseMedicineHomeCardOne> cloudDispenseMedicineHomeCard;

	/** 
	 * 投放类型
	 */
	@ApiField("delivery_type")
	private String deliveryType;

	/** 
	 * 医生智能体推荐卡
	 */
	@ApiField("doctor_agent_card")
	private YpzDoctorAgentCardOne doctorAgentCard;

	/** 
	 * 线下陪诊卡
	 */
	@ApiField("med_accompany_card")
	private YpzMedAccompanyCardOne medAccompanyCard;

	/** 
	 * NPS卡
	 */
	@ApiField("nps_card")
	private YpzNpsCardOne npsCard;

	/** 
	 * 线下物料卡
	 */
	@ApiField("offline_qr_code_card")
	private YpzOfflineQrCodeCardOne offlineQrCodeCard;

	/** 
	 * 个性化推荐卡
	 */
	@ApiField("qa_card")
	private YpzQaCardOne qaCard;

	public void setAfuDownloadCard(YpzAfuDownloadCardOne afuDownloadCard) {
		this.afuDownloadCard = afuDownloadCard;
	}
	public YpzAfuDownloadCardOne getAfuDownloadCard( ) {
		return this.afuDownloadCard;
	}

	public void setCloudDispenseMedicineCard(YpzCloudDispenseMedicineCardOne cloudDispenseMedicineCard) {
		this.cloudDispenseMedicineCard = cloudDispenseMedicineCard;
	}
	public YpzCloudDispenseMedicineCardOne getCloudDispenseMedicineCard( ) {
		return this.cloudDispenseMedicineCard;
	}

	public void setCloudDispenseMedicineHomeCard(List<YpzCloudDispenseMedicineHomeCardOne> cloudDispenseMedicineHomeCard) {
		this.cloudDispenseMedicineHomeCard = cloudDispenseMedicineHomeCard;
	}
	public List<YpzCloudDispenseMedicineHomeCardOne> getCloudDispenseMedicineHomeCard( ) {
		return this.cloudDispenseMedicineHomeCard;
	}

	public void setDeliveryType(String deliveryType) {
		this.deliveryType = deliveryType;
	}
	public String getDeliveryType( ) {
		return this.deliveryType;
	}

	public void setDoctorAgentCard(YpzDoctorAgentCardOne doctorAgentCard) {
		this.doctorAgentCard = doctorAgentCard;
	}
	public YpzDoctorAgentCardOne getDoctorAgentCard( ) {
		return this.doctorAgentCard;
	}

	public void setMedAccompanyCard(YpzMedAccompanyCardOne medAccompanyCard) {
		this.medAccompanyCard = medAccompanyCard;
	}
	public YpzMedAccompanyCardOne getMedAccompanyCard( ) {
		return this.medAccompanyCard;
	}

	public void setNpsCard(YpzNpsCardOne npsCard) {
		this.npsCard = npsCard;
	}
	public YpzNpsCardOne getNpsCard( ) {
		return this.npsCard;
	}

	public void setOfflineQrCodeCard(YpzOfflineQrCodeCardOne offlineQrCodeCard) {
		this.offlineQrCodeCard = offlineQrCodeCard;
	}
	public YpzOfflineQrCodeCardOne getOfflineQrCodeCard( ) {
		return this.offlineQrCodeCard;
	}

	public void setQaCard(YpzQaCardOne qaCard) {
		this.qaCard = qaCard;
	}
	public YpzQaCardOne getQaCard( ) {
		return this.qaCard;
	}

}
