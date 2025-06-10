package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 负荷聚合预测数据上报
 *
 * @author auto create
 * @since 1.0, 2024-12-02 10:48:26
 */
public class AnttechBlockchainFinanceEnergyPredictSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 7217167176475622766L;

	/**
	 * 预测数据类型
	 */
	@ApiField("data_type")
	private String dataType;

	/**
	 * 负荷资源外部Id，如站点id、系统id、设备id等
	 */
	@ApiField("out_resource_id")
	private String outResourceId;

	/**
	 * 预测日期
	 */
	@ApiField("predict_date")
	private String predictDate;

	/**
	 * 预测时间段内的平均功率
	 */
	@ApiListField("predict_load_list")
	@ApiField("load_info_node")
	private List<LoadInfoNode> predictLoadList;

	/**
	 * 时间间隔，单位 分钟；
	 */
	@ApiField("predict_timespan")
	private Long predictTimespan;

	/**
	 * 产品合约码
	 */
	@ApiField("product_agreement_code")
	private String productAgreementCode;

	public String getDataType() {
		return this.dataType;
	}
	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getOutResourceId() {
		return this.outResourceId;
	}
	public void setOutResourceId(String outResourceId) {
		this.outResourceId = outResourceId;
	}

	public String getPredictDate() {
		return this.predictDate;
	}
	public void setPredictDate(String predictDate) {
		this.predictDate = predictDate;
	}

	public List<LoadInfoNode> getPredictLoadList() {
		return this.predictLoadList;
	}
	public void setPredictLoadList(List<LoadInfoNode> predictLoadList) {
		this.predictLoadList = predictLoadList;
	}

	public Long getPredictTimespan() {
		return this.predictTimespan;
	}
	public void setPredictTimespan(Long predictTimespan) {
		this.predictTimespan = predictTimespan;
	}

	public String getProductAgreementCode() {
		return this.productAgreementCode;
	}
	public void setProductAgreementCode(String productAgreementCode) {
		this.productAgreementCode = productAgreementCode;
	}

}
