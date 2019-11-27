package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 口碑优惠活动创建
 *
 * @author auto create
 * @since 1.0, 2016-03-28 11:54:59
 */
public class AlipayOfflineMarketingDiscountActivityCreateModel extends AlipayObject {

	private static final long serialVersionUID = 7829327119318878274L;

	/**
	 * 活动基本信息
	 */
	@ApiField("activity")
	private ActivityDto activity;

	/**
	 * 扩展信息
	 */
	@ApiField("ext_info")
	private String extInfo;

	/**
	 * 外部流水号
	 */
	@ApiField("out_biz_no")
	private String outBizNo;

	/**
	 * 活动奖品信息列表
	 */
	@ApiListField("pirze_list")
	@ApiField("prize_dto")
	private List<PrizeDto> pirzeList;

	/**
	 * 投放信息
	 */
	@ApiField("putin")
	private PutinDto putin;

	public ActivityDto getActivity() {
		return this.activity;
	}
	public void setActivity(ActivityDto activity) {
		this.activity = activity;
	}

	public String getExtInfo() {
		return this.extInfo;
	}
	public void setExtInfo(String extInfo) {
		this.extInfo = extInfo;
	}

	public String getOutBizNo() {
		return this.outBizNo;
	}
	public void setOutBizNo(String outBizNo) {
		this.outBizNo = outBizNo;
	}

	public List<PrizeDto> getPirzeList() {
		return this.pirzeList;
	}
	public void setPirzeList(List<PrizeDto> pirzeList) {
		this.pirzeList = pirzeList;
	}

	public PutinDto getPutin() {
		return this.putin;
	}
	public void setPutin(PutinDto putin) {
		this.putin = putin;
	}

}
