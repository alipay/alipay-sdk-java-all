package com.alipay.api.response;

import java.util.List;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;
import com.alipay.api.domain.CarModel;

import com.alipay.api.AlipayResponse;

/**
 * ALIPAY API: alipay.ins.auto.autoinsprod.enquriy.apply response.
 * 
 * @author auto create
 * @since 1.0, 2023-04-03 09:31:44
 */
public class AlipayInsAutoAutoinsprodEnquriyApplyResponse extends AlipayResponse {

	private static final long serialVersionUID = 4376985515986125841L;

	/** 
	 * 车辆的品牌型号列表
	 */
	@ApiListField("car_model")
	@ApiField("car_model")
	private List<CarModel> carModel;

	/** 
	 * 车险询价申请号
	 */
	@ApiField("enquiry_biz_id")
	private String enquiryBizId;

	/** 
	 * 外部询价申请业务单号（幂等字段）
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	public void setCarModel(List<CarModel> carModel) {
		this.carModel = carModel;
	}
	public List<CarModel> getCarModel( ) {
		return this.carModel;
	}

	public void setEnquiryBizId(String enquiryBizId) {
		this.enquiryBizId = enquiryBizId;
	}
	public String getEnquiryBizId( ) {
		return this.enquiryBizId;
	}

	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}
	public String getOutBizNo( ) {
		return this.outBizNo;
	}

}
