import org.apache.http.HttpEntity;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class NewApiTest {
    CloseableHttpResponse response=null;
    String entityStr = null;
    //登录url
    String url ="http://192.168.3.47:9002/zyapi/lucky/luckyPrize";

    @Test(invocationCount = 1, threadPoolSize = 0)
    public void JdLoginTest() throws IOException {

        // 获取连接客户端工具
        CloseableHttpClient httpClient= HttpClients.createDefault();
        // 创建POST请求对象
        HttpPost httpPost=new HttpPost(url);

        // httpPost.addHeader post请求 header
        httpPost.addHeader("Content-Type","application/x-www-form-urlencoded; charset=UTF-8");
        httpPost.addHeader("User-Agent:","Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_0) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.122 Safari/537.36");
//        List<Header> headerList= Lists.newArrayList();
//        headerList.add(new BasicHeader(HttpHeaders.CONTENT_TYPE,"application/x-www-form-urlencoded; charset=UTF-8"));
//        headerList.add(new BasicHeader(HttpHeaders.USER_AGENT,"Mozilla/5.0 (Macintosh; Intel Mac OS X 10_14_0) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.122 Safari/537.36"));

        //参数封装对象
        List<NameValuePair> params=new ArrayList<NameValuePair>();

        try{
            params.add(new BasicNameValuePair("id","19"));
            params.add(new BasicNameValuePair("orderNo","wja2021061110024518487"));

            // 使用URL实体转换工具
            UrlEncodedFormEntity entityParam = new UrlEncodedFormEntity(params, "UTF-8");

            httpPost.setEntity(entityParam);
            // 执行请求
            response=httpClient.execute(httpPost);
            // 获得响应的实体对象
            HttpEntity entity=response.getEntity();
            // 使用Apache提供的工具类进行转换成字符串
            int code =response.getStatusLine().getStatusCode();
            System.out.println("StatusCode: " + code);

            Assert.assertEquals(200,code);

            entityStr= EntityUtils.toString(entity,"UTF-8");

            System.out.println("接口返回结果是:="+entityStr);

        }catch(Exception e){
            e.printStackTrace();
        }finally {

            //释放资源
            if(httpClient!=null) {
                httpClient.close();
            }
            if (response!=null){
                response.close();
            }
        }


    }
}
