package com.alipay.api.domain;

import java.util.Date;
import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 保险科技通用查询
 *
 * @author auto create
 * @since 1.0, 2023-06-28 19:30:32
 */
public class AnttechBlockchainFinanceIncomeAssetSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 4549257614243861613L;

	/**
	 * 实物资产对应的外部编号，如设备号号码
	 */
	@ApiField("asset_out_no")
	private String assetOutNo;

	/**
	 * 资产登记流水号，用于幂等校验
	 */
	@ApiField("biz_no")
	private String bizNo;

	/**
	 * 设备类型，根据实际设备类型填写
	 */
	@ApiField("device_type")
	private String deviceType;

	/**
	 * 收益分配产品码，可联系产品或运营同学获取
	 */
	@ApiField("distribution_pro_no")
	private String distributionProNo;

	/**
	 * 实物品牌，按照实际资产设备品牌填写
	 */
	@ApiField("material_brand")
	private String materialBrand;

	/**
	 * 实物型号，按照实际资产设备型号填写
	 */
	@ApiField("material_model_no")
	private String materialModelNo;

	/**
	 * 实物的实际生产时间，时间格式：yyyy-MM-dd
	 */
	@ApiField("produce_date")
	private Date produceDate;

	/**
	 * 权属材料文件ID，请按照文件上传返回的fileId提供
	 */
	@ApiField("prove_file_id")
	private String proveFileId;

	/**
	 * 相关方列表
	 */
	@ApiListField("related_parties")
	@ApiField("related_parties")
	private List<RelatedParties> relatedParties;

	public String getAssetOutNo() {
		return this.assetOutNo;
	}
	public void setAssetOutNo(String assetOutNo) {
		this.assetOutNo = assetOutNo;
	}

	public String getBizNo() {
		return this.bizNo;
	}
	public void setBizNo(String bizNo) {
		this.bizNo = bizNo;
	}

	public String getDeviceType() {
		return this.deviceType;
	}
	public void setDeviceType(String deviceType) {
		this.deviceType = deviceType;
	}

	public String getDistributionProNo() {
		return this.distributionProNo;
	}
	public void setDistributionProNo(String distributionProNo) {
		this.distributionProNo = distributionProNo;
	}

	public String getMaterialBrand() {
		return this.materialBrand;
	}
	public void setMaterialBrand(String materialBrand) {
		this.materialBrand = materialBrand;
	}

	public String getMaterialModelNo() {
		return this.materialModelNo;
	}
	public void setMaterialModelNo(String materialModelNo) {
		this.materialModelNo = materialModelNo;
	}

	public Date getProduceDate() {
		return this.produceDate;
	}
	public void setProduceDate(Date produceDate) {
		this.produceDate = produceDate;
	}

	public String getProveFileId() {
		return this.proveFileId;
	}
	public void setProveFileId(String proveFileId) {
		this.proveFileId = proveFileId;
	}

	public List<RelatedParties> getRelatedParties() {
		return this.relatedParties;
	}
	public void setRelatedParties(List<RelatedParties> relatedParties) {
		this.relatedParties = relatedParties;
	}

}
