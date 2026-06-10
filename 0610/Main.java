import jakarta.mail.*;
import jakarta.mail.internet.*;
import java.util.Properties;

// import java.net.PasswordAuthentication;
// import jakarta.mail.Authenticator;
// import jakarta.mail.Session;

public class Main {
    public static void main(String[] args) {
        // =========================
        // ロリポップの設定情報
        // =========================
        final String username = "";  // 自分のメールアドレス
        final String password = "";    // パスワード
        final String smtpServer = "";    // SMTPサーバーのアドレス
        final String smtpPort = "";                  // SMTPサーバーのポート番号
        
        // =========================
        // メールの内容情報
        // =========================
        final String toEmail = "";       // 送信先のメールアドレス
        final String fromEmail = ""; // 送信元のメールアドレス
        final String fromName = "";              // 送信者名
        final String subject = ""; // 件名
        final String body = """
        
        """; // 本文

        // =========================
        // メール送信
        // =========================
        // メール送信の準備
        Properties props = new Properties();
        props.put("mail.smtp.host", smtpServer);    // SMTPサーバーの設定
        props.put("mail.smtp.port", smtpPort);      // SMTPサーバーのポート設定
        props.put("mail.smtp.auth", "true"); // ログインしますか？設定(true=>はい)
        props.put("mail.smtp.ssl.enable", "true");  // セキュアにします？設定(true=>はい)
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");

        // 認証の設定をしている
        Session session = Session.getInstance(props, new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        // メール送信
        try {
            // メールを作っている
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress(fromEmail, fromName, "UTF-8"));
            message.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmail));
            message.setSubject(subject);
            message.setText(body);

            // メール送信実行！！
            Transport.send(message);
            System.out.println("メール送信成功！！");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
