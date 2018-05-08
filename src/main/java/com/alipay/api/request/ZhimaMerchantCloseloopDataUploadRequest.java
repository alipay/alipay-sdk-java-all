package com.alipay.api.request;

import java.util.HashMap;
import java.util.Map;

import com.alipay.api.FileItem;
import com.alipay.api.AlipayUploadRequest;
import com.alipay.api.internal.util.AlipayHashMap;
import com.alipay.api.response.ZhimaMerchantCloseloopDataUploadResponse;
import com.alipay.api.AlipayObject;

/**
 * ALIPAY API: zhima.merchant.closeloop.data.upload request
 * 
 * @author auto create
 * @since 1.0, 2018-01-11 15:47:27
 */
public class ZhimaMerchantCloseloopDataUploadRequest implements AlipayUploadRequest<ZhimaMerchantCloseloopDataUploadResponse> {

	private AlipayHashMap udfParams; // add user-defined text parameters
	private String apiVersion="1.0";

	/** 
	* 公用回传参数（非必填），该参数会透传给商户，商户可以用于业务逻辑处理，请使用json格式。
	 */
	private String bizExtParams;

	/** 
	* 单条数据的数据列，多个列以逗号隔开。
	 */
	private String columns;

	/** 
	* 传入的json格式的文件，其中records属性必填。json中的字段可以通过如下步骤获取：首先调用zhima.merchant.data.upload.initialize接口获取数据模板，该接口会返回一个数据模板文件的url地址，如：http://zmxymerchant-prod.oss-cn-shenzhen.zmxy.com.cn/openApi/openDoc/信用护航-负面记录和信用足迹商户数据模板V1.0.xlsx，该数据模板文件详细列出了需要传入的字段，及各字段的要求，data中的各字段就是该文件中列出的字段编码。
	 */
	private FileItem file;

	/** 
	* 文件的编码，如果文件格式是UTF-8，则填写UTF-8，如果文件格式是GBK，则填写GBK。
	 */
	private String fileCharset;

	/** 
	* 芝麻平台服务商模式下的二级商户标识（即二级商户PID），如果是直连商户调用该接口，不需要设置
	 */
	private String linkedMerchantId;

	/** 
	* 主键列使用传入字段进行组合，也可以使用传入的某个单字段（确保主键稳定，而且可以很好的区分不同的数据）。例如order_no,pay_month或者order_no,bill_month组合，对于一个order_no只会有一条数据的情况，直接使用order_no作为主键列。
	 */
	private String primaryKeyColumns;

	/** 
	* 文件数据记录条数，如file字段中的record数组有10条数据，那么就填10。
	 */
	private String records;

	/** 
	* 数据应用的场景编码，场景码和场景名称（数字或字符串为场景码）如下：
8：数据反馈
32：骑行
CAR_RENTING：租车行业解决方案
每个场景码对应的数据模板不一样，请使用zhima.merchant.data.upload.initialize接口获取场景码对应的数据模板。
	 */
	private String sceneCode;

	public void setBizExtParams(String bizExtParams) {
		this.bizExtParams = bizExtParams;
	}
	public String getBizExtParams() {
		return this.bizExtParams;
	}

	public void setColumns(String columns) {
		this.columns = columns;
	}
	public String getColumns() {
		return this.columns;
	}

	public void setFile(FileItem file) {
		this.file = file;
	}
	public FileItem getFile() {
		return this.file;
	}

	public void setFileCharset(String fileCharset) {
		this.fileCharset = fileCharset;
	}
	public String getFileCharset() {
		return this.fileCharset;
	}

	public void setLinkedMerchantId(String linkedMerchantId) {
		this.linkedMerchantId = linkedMerchantId;
	}
	public String getLinkedMerchantId() {
		return this.linkedMerchantId;
	}

	public void setPrimaryKeyColumns(String primaryKeyColumns) {
		this.primaryKeyColumns = primaryKeyColumns;
	}
	public String getPrimaryKeyColumns() {
		return this.primaryKeyColumns;
	}

	public void setRecords(String records) {
		this.records = records;
	}
	public String getRecords() {
		return this.records;
	}

	public void setSceneCode(String sceneCode) {
		this.sceneCode = sceneCode;
	}
	public String getSceneCode() {
		return this.sceneCode;
	}
	private String terminalType;
	private String terminalInfo;
	private String prodCode;
	private String notifyUrl;
	private String returnUrl;
    private boolean needEncrypt=false;
	private AlipayObject bizModel=null;

	public String getNotifyUrl() {
		return this.notifyUrl;
	}

	public void setNotifyUrl(String notifyUrl) {
		this.notifyUrl = notifyUrl;
	}

	public String getReturnUrl() {
		return this.returnUrl;
	}

	public void setReturnUrl(String returnUrl) {
		this.returnUrl = returnUrl;
	}

	public String getApiVersion() {
		return this.apiVersion;
	}
	public void setApiVersion(String apiVersion) {
		this.apiVersion = apiVersion;
	}

	public void setTerminalType(String terminalType){
		this.terminalType=terminalType;
	}
	
    public String getTerminalType(){
    	return this.terminalType;
    }

    public void setTerminalInfo(String terminalInfo){
    	this.terminalInfo=terminalInfo;
    }

    public String getTerminalInfo(){
    	return this.terminalInfo;
    }
	
	public String getProdCode() {
		return this.prodCode; 
	}
	
	public void setProdCode(String prodCode) {
		this.prodCode=prodCode;
	}
    
	public String getApiMethodName() {
		return "zhima.merchant.closeloop.data.upload";
	}

	public Map<String, String> getTextParams() {		
		AlipayHashMap txtParams = new AlipayHashMap();
		txtParams.put("biz_ext_params", this.bizExtParams);
		txtParams.put("columns", this.columns);
		txtParams.put("file_charset", this.fileCharset);
		txtParams.put("linked_merchant_id", this.linkedMerchantId);
		txtParams.put("primary_key_columns", this.primaryKeyColumns);
		txtParams.put("records", this.records);
		txtParams.put("scene_code", this.sceneCode);
		if(udfParams != null) {
			txtParams.putAll(this.udfParams);
		}
		return txtParams;
	}
	
	public void putOtherTextParam(String key, String value) {
		if(this.udfParams == null) {
			this.udfParams = new AlipayHashMap();
		}
		this.udfParams.put(key, value);
	}

	public Map<String, FileItem> getFileParams() {
		Map<String, FileItem> params = new HashMap<String, FileItem>();
		params.put("file", this.file);
		return params;
	}

	public Class<ZhimaMerchantCloseloopDataUploadResponse> getResponseClass() {
		return ZhimaMerchantCloseloopDataUploadResponse.class;
	}
	
	 public boolean isNeedEncrypt() {
    
      return this.needEncrypt;
    }


    public void setNeedEncrypt(boolean needEncrypt) {
    
         this.needEncrypt=needEncrypt;
    }
    
    public AlipayObject getBizModel() {
    
      return this.bizModel;
    }


    public void setBizModel(AlipayObject bizModel) {
    
         this.bizModel=bizModel;
    }
	
	
}
