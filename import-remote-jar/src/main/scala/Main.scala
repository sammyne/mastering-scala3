import okhttp3.*

@main def main: Unit =
  val c = OkHttpClient()

  val request = Request.Builder().url("https://docs.qq.com").build()

  val reply = c.newCall(request).execute()

  if reply.isSuccessful() then println(reply.body().string())
