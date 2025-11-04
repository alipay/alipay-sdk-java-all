package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 车务材料回传
 *
 * @author auto create
 * @since 1.0, 2025-09-18 11:29:40
 */
public class XingheLendassistCarfinCarproxymaterialNotifyModel extends AlipayObject {

	private static final long serialVersionUID = 6312668468232978759L;

	/**
	 * 文件信息列表
	 */
	@ApiListField("file_list")
	@ApiField("carfin_mortgage_received_file")
	private List<CarfinMortgageReceivedFile> fileList;

	/**
	 * 星河侧抵押订单号
	 */
	@ApiField("mortgage_no")
	private String mortgageNo;

	/**
	 * 材料回传场景
	 */
	@ApiField("notify_scene")
	private String notifyScene;

	/**
	 * 外部代理人订单号
	 */
	@ApiField("out_proxy_no")
	private String outProxyNo;

	public List<CarfinMortgageReceivedFile> getFileList() {
		return this.fileList;
	}
	public void setFileList(List<CarfinMortgageReceivedFile> fileList) {
		this.fileList = fileList;
	}

	public String getMortgageNo() {
		return this.mortgageNo;
	}
	public void setMortgageNo(String mortgageNo) {
		this.mortgageNo = mortgageNo;
	}

	public String getNotifyScene() {
		return this.notifyScene;
	}
	public void setNotifyScene(String notifyScene) {
		this.notifyScene = notifyScene;
	}

	public String getOutProxyNo() {
		return this.outProxyNo;
	}
	public void setOutProxyNo(String outProxyNo) {
		this.outProxyNo = outProxyNo;
	}

}
