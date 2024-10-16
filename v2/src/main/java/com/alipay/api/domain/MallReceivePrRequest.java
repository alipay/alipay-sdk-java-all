package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 订单信息
 *
 * @author auto create
 * @since 1.0, 2023-07-11 11:09:52
 */
public class MallReceivePrRequest extends AlipayObject {

	private static final long serialVersionUID = 1351451451737662176L;

	/**
	 * app_code
	 */
	@ApiField("app_code")
	private String appCode;

	/**
	 * fix_user_id，用于下pr单
	 */
	@ApiField("fix_user_id")
	private String fixUserId;

	/**
	 * 附件信息，用于下pr单
	 */
	@ApiListField("mall_files")
	@ApiField("mall_file")
	private List<MallFile> mallFiles;

	/**
	 * order_items，用于下pr单
	 */
	@ApiListField("order_items")
	@ApiField("punchout_order_item")
	private List<PunchoutOrderItem> orderItems;

	/**
	 * out_pur_req_id，用于下pr单
	 */
	@ApiField("out_pur_req_id")
	private String outPurReqId;

	/**
	 * pur_req_id，用于下pr单
	 */
	@ApiField("pur_req_id")
	private String purReqId;

	public String getAppCode() {
		return this.appCode;
	}
	public void setAppCode(String appCode) {
		this.appCode = appCode;
	}

	public String getFixUserId() {
		return this.fixUserId;
	}
	public void setFixUserId(String fixUserId) {
		this.fixUserId = fixUserId;
	}

	public List<MallFile> getMallFiles() {
		return this.mallFiles;
	}
	public void setMallFiles(List<MallFile> mallFiles) {
		this.mallFiles = mallFiles;
	}

	public List<PunchoutOrderItem> getOrderItems() {
		return this.orderItems;
	}
	public void setOrderItems(List<PunchoutOrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	public String getOutPurReqId() {
		return this.outPurReqId;
	}
	public void setOutPurReqId(String outPurReqId) {
		this.outPurReqId = outPurReqId;
	}

	public String getPurReqId() {
		return this.purReqId;
	}
	public void setPurReqId(String purReqId) {
		this.purReqId = purReqId;
	}

}
