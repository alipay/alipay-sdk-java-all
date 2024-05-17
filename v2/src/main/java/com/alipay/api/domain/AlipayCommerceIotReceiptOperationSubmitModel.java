package com.alipay.api.domain;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;

/**
 * 电子小票运营操作
 *
 * @author auto create
 * @since 1.0, 2021-04-06 13:45:54
 */
public class AlipayCommerceIotReceiptOperationSubmitModel extends AlipayObject {

	private static final long serialVersionUID = 5693113415365748291L;

	/**
	 * 在op_type为create的时候实体为必传字段
	 */
	@ApiField("banner_info")
	private BannerInfo bannerInfo;

	/**
	 * 操作类型
create  创建 banner
offline 下线banner
	 */
	@ApiField("op_type")
	private String opType;

	/**
	 * 直连商户id
	 */
	@ApiField("pid")
	private String pid;

	/**
	 * 间连模式商户id
	 */
	@ApiField("smid")
	private String smid;

	public BannerInfo getBannerInfo() {
		return this.bannerInfo;
	}
	public void setBannerInfo(BannerInfo bannerInfo) {
		this.bannerInfo = bannerInfo;
	}

	public String getOpType() {
		return this.opType;
	}
	public void setOpType(String opType) {
		this.opType = opType;
	}

	public String getPid() {
		return this.pid;
	}
	public void setPid(String pid) {
		this.pid = pid;
	}

	public String getSmid() {
		return this.smid;
	}
	public void setSmid(String smid) {
		this.smid = smid;
	}

}
