# university-management
شرح کلی پروژه
این پروژه یک سیستم مدیریت ساده برای دانشگاه  است که شامل کلاس‌هایی برای مدیریت افراد، دانشجویان، اساتید، دروس، و نمرات می‌شود. این سیستم به شما امکان می‌دهد دانشجویان را ثبت نام کنید، دروس ارائه شده را مدیریت کنید، و نمرات دانشجویان را ثبت و میانگین موزون را محاسبه کنید و کارنامه ی هر دانشجو را چاپ کنید.

ساختار کلی پروژه
پروژه شامل دو پکیج base و uni است که در آن ها کلاس های مختلف را می توان مشاهده کرد. پکیج base شامل تک کلاس Person است  و بقیه کلاس ها پکیج uni را شکل می دهند.
در تمامی کلاس ها جز Transcript یک متد به نام findByID  داریم. همانطور که اسمش پیداست به کمک آیدی آن فیلد آن را پیدا میکند و به ما برمیگرداند.

کلاس‌های اصلی
Person:
مدیریت اطلاعات افراد (نام، کد ملی، و شناسه شخص).

Major:
مدیریت رشته‌های تحصیلی (نام رشته، حداکثر ظرفیت، و تعداد دانشجویان).
متد addStudent برای افزودن دانشجو به رشته.

Student:
مدیریت اطلاعات دانشجویان (کد دانشجویی، سال ورود، و رشته تحصیلی).
متد setStudentCode برای تولید کد دانشجویی.

Professor:
مدیریت اطلاعات اساتید (شناسه شخص و رشته تحصیلی).

Course:
مدیریت دروس (عنوان درس و تعداد واحدها).

PresentedCourse:
مدیریت دروس ارائه شده (شناسه درس، شناسه استاد، و حداکثر ظرفیت).
متد addStudent برای افزودن دانشجو به درس ارائه شده.

Transcript:
مدیریت نمرات دانشجویان.
متد setGrade برای ثبت نمره.
متد printTranscript برای چاپ کارنامه.
متد getGPA برای محاسبه معدل دانشجو.

چند ویژگی در کلاس ها و متد های تعریف شده:
لیست‌های استاتیک: تمامی لیست‌ها (مانند personList, majorList, و غیره) به صورت استاتیک تعریف شده‌اند و در طول اجرای برنامه نگهداری می‌شوند.
مدیریت خطاها: در صورت وجود خطا (مانند عدم یافتن یک شیء)، پیام خطای مناسب نمایش داده می‌شود.
تولید کد دانشجویی: کد دانشجویی به صورت ترکیبی از سال ورود، شناسه رشته، و شناسه دانشجو تولید می‌شود

خروجی برنامه
در این برنامه ما ۲ رشته و ۵ فرد و ۳ درس داریم که سه نفر اول دانشجو هستند و دو نفر بعد اساتید ما هستند . دو دانشجو اول در رشته اول و نفر سوم در رشته دوم تحصیل میکند. هر یک از اساتید یکی از رشته ها را تدریس می کنند که دو درس اول را استاد اول و سایر رو دیگری تدریس می کند. در درس اول دانشجو اول و دوم  و در درس دوم هر سه دانشجو و در درس اخر نتها نفر سوم شرکت کرده است. 
در خروجی ابتدا نام کامل و شماره دانشجویی هر یک از دانشجویی ها و بعد نام و آیدی هر یک از اساتید نمایش داده می شود. بعد کارنامه ی هر دانشجو که شامل نام٬ شماره دانشجویی٬ نام دروس و نمره انها می شود چاپ می شود و در انتها معدل موزون هر یک چاپ می شود. 
