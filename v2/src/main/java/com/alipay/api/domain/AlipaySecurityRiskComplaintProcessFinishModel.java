package com.alipay.api.domain;

import java.util.List;

import com.alipay.api.AlipayObject;
import com.alipay.api.internal.mapping.ApiField;
import com.alipay.api.internal.mapping.ApiListField;

/**
 * 处理消费者投诉
 *
 * @author auto create
 * @since 1.0, 2024-03-11 15:05:19
 */
public class AlipaySecurityRiskComplaintProcessFinishModel extends AlipayObject {

	private static final long serialVersionUID = 6175985875165314273L;

	/**
	 * 本次进行处理的投诉id列表(主表主键)
	 */
	@ApiListField("id_list")
	@ApiField("number")
	private List<Long> idList;

	/**
	 * 投诉处理附加上传的图片文件列表，每个图片文件有url和key两个字段，通过调用文件上传接口获得url和key
	 */
	@ApiListField("img_file_list")
	@ApiField("img_file")
	private List<ImgFile> imgFileList;

	/**
	 * 商家处理投诉结果码
	 */
	@ApiField("process_code")
	private String processCode;

	/**
	 * 本次投诉处理的备注信息
	 */
	@ApiField("remark")
	private String remark;

	public List<Long> getIdList() {
		return this.idList;
	}
	public void setIdList(List<Long> idList) {
		this.idList = idList;
	}

	public List<ImgFile> getImgFileList() {
		return this.imgFileList;
	}
	public void setImgFileList(List<ImgFile> imgFileList) {
		this.imgFileList = imgFileList;
	}

	public String getProcessCode() {
		return this.processCode;
	}
	public void setProcessCode(String processCode) {
		this.processCode = processCode;
	}

	public String getRemark() {
		return this.remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}

}
